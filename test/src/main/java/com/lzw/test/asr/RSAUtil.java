package com.lzw.test.asr;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * RSA算法，实现数据的加密解密。
 */
public class RSAUtil {
    private static Cipher cipher;

    static {
        try {
            cipher = Cipher.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成密钥对
     *
     * @param filePath 生成密钥的路径
     * @return
     */
    public static Map<String, String> generateKeyPair(String filePath) {
        try {
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            // 密钥位数  
            keyPairGen.initialize(2048);
            // 密钥对  
            KeyPair keyPair = keyPairGen.generateKeyPair();
            // 公钥  
            PublicKey publicKey = keyPair.getPublic();
            // 私钥  
            PrivateKey privateKey = keyPair.getPrivate();
            //得到公钥字符串  
            String publicKeyString = getKeyString(publicKey);
            //得到私钥字符串  
            String privateKeyString = getKeyString(privateKey);
            //将密钥对写入到文件  
            FileWriter pubfw = new FileWriter(filePath + "/publicKey.keystore");
            FileWriter prifw = new FileWriter(filePath + "/privateKey.keystore");
            BufferedWriter pubbw = new BufferedWriter(pubfw);
            BufferedWriter pribw = new BufferedWriter(prifw);
            pubbw.write(publicKeyString);
            pribw.write(privateKeyString);
            pubbw.flush();
            pubbw.close();
            pubfw.close();
            pribw.flush();
            pribw.close();
            prifw.close();
            //将生成的密钥对返回  
            Map<String, String> map = new HashMap<String, String>();
            map.put("publicKey", publicKeyString);
            map.put("privateKey", privateKeyString);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 得到公钥
     *
     * @param key 密钥字符串（经过base64编码）
     * @throws Exception
     */
    public static PublicKey getPublicKey(String key) throws Exception {
        byte[] keyBytes;
        keyBytes = (new BASE64Decoder()).decodeBuffer(key);
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(keySpec);
        return publicKey;
    }

    /**
     * 得到私钥
     *
     * @param key 密钥字符串（经过base64编码）
     * @throws Exception
     */
    public static PrivateKey getPrivateKey(String key) throws Exception {
        byte[] keyBytes;
        keyBytes = (new BASE64Decoder()).decodeBuffer(key);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
        return privateKey;
    }

    /**
     * 得到密钥字符串（经过base64编码）
     *
     * @return
     */
    public static String getKeyString(Key key) throws Exception {
        byte[] keyBytes = key.getEncoded();
        String s = (new BASE64Encoder()).encode(keyBytes);
        return s;
    }

    /**
     * 使用公钥对明文进行加密，返回BASE64编码的字符串
     *
     * @param publicKey
     * @param plainText
     * @return
     */
    public static String encrypt(PublicKey publicKey, String plainText) {
        try {
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] enBytes = cipher.doFinal(plainText.getBytes());
            return (new BASE64Encoder()).encode(enBytes);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 使用keystore对明文进行加密
     *
     * @param publicKeystore 公钥文件路径
     * @param plainText      明文
     * @return
     */
    public static String fileEncrypt(String publicKeystore, String plainText) {
        try {
            FileReader fr = new FileReader(publicKeystore);
            BufferedReader br = new BufferedReader(fr);
            String publicKeyString = "";
            String str;
            while ((str = br.readLine()) != null) {
                publicKeyString += str;
            }
            br.close();
            fr.close();
            cipher.init(Cipher.ENCRYPT_MODE, getPublicKey(publicKeyString));
            byte[] enBytes = cipher.doFinal(plainText.getBytes());
            return (new BASE64Encoder()).encode(enBytes);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 使用公钥对明文进行加密
     *
     * @param publicKey 公钥
     * @param plainText 明文
     * @return
     */
    public static String encrypt(String publicKey, String plainText) {
//        try {
//            cipher.init(Cipher.ENCRYPT_MODE, getPublicKey(publicKey));
//            byte[] enBytes = cipher.doFinal(plainText.getBytes());
//            return (new BASE64Encoder()).encode(enBytes);
//        } catch (InvalidKeyException e) {
//            e.printStackTrace();
//        } catch (IllegalBlockSizeException e) {
//            e.printStackTrace();
//        } catch (BadPaddingException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
        return RSATools.encryptedDataOnJava( plainText,publicKey);
    }

    /**
     * 使用私钥对明文密文进行解密
     *
     * @param privateKey
     * @param enStr
     * @return
     */
    public static String decrypt(PrivateKey privateKey, String enStr) {
        try {
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] deBytes = cipher.doFinal((new BASE64Decoder()).decodeBuffer(enStr));
            return new String(deBytes);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 使用私钥对密文进行解密
     *
     * @param privateKey 私钥
     * @param enStr      密文
     * @return
     */
    public static String decrypt(String privateKey, String enStr) {
/*        try {
            cipher.init(Cipher.DECRYPT_MODE, getPrivateKey(privateKey));
            byte[] deBytes = cipher.doFinal((new BASE64Decoder()).decodeBuffer(enStr));
            return new String(deBytes);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;*/
        return RSATools.decryptDataOnJava(enStr,privateKey);
    }

    /**
     * 使用keystore对密文进行解密
     *
     * @param privateKeystore 私钥路径
     * @param enStr           密文
     * @return
     */
    public static String fileDecrypt(String privateKeystore, String enStr) {
        try {
            FileReader fr = new FileReader(privateKeystore);
            BufferedReader br = new BufferedReader(fr);
            String privateKeyString = "";
            String str;
            while ((str = br.readLine()) != null) {
                privateKeyString += str;
            }
            br.close();
            fr.close();
            cipher.init(Cipher.DECRYPT_MODE, getPrivateKey(privateKeyString));
            byte[] deBytes = cipher.doFinal((new BASE64Decoder()).decodeBuffer(enStr));
            return new String(deBytes);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        String publicKey;
        String privateKey;

//        publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAviSuCu4Yg/WAyjp06qiaE/ioI2M/ACT9UTUVxWtM7IZlXMQZPjLn0H1x0zmJ/VLIhnBliyb06QLvtrrBFRt4jnOJR5LjoTg/g8XYdVXN6a+XFjqFvOUPgzZ7OdywOoXxiO+M7WrvT0XgqyBqCnDADpY1eucDqfIDYYOBHKbtMkh0N4ZVBcfULb1Sm+Q7ed+jUa8eXPQPhMrWvhQkIeZJh+hCIrNjXUxyfZPh1tSvqoJYArbyHZs8LnbUtjIQCx9OlR9+xJTx3L9h89I4D+hqA4CZqxUzfibsu5XgYKnoSri2OCR2FefSfYlCd8Fysp0wET/r1L141qnhoMQtrUs8jwIDAQAB";
//        privateKey = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC+JK4K7hiD9YDKOnTqqJoT+KgjYz8AJP1RNRXFa0zshmVcxBk+MufQfXHTOYn9UsiGcGWLJvTpAu+2usEVG3iOc4lHkuOhOD+Dxdh1Vc3pr5cWOoW85Q+DNns53LA6hfGI74ztau9PReCrIGoKcMAOljV65wOp8gNhg4Ecpu0ySHQ3hlUFx9QtvVKb5Dt536NRrx5c9A+Eyta+FCQh5kmH6EIis2NdTHJ9k+HW1K+qglgCtvIdmzwudtS2MhALH06VH37ElPHcv2Hz0jgP6GoDgJmrFTN+Juy7leBgqehKuLY4JHYV59J9iUJ3wXKynTARP+vUvXjWqeGgxC2tSzyPAgMBAAECggEAMhFkhtpFOFIoFJgp+zRkRgf+9jqG91nGHmEVF4P2oH2PKUs1vmwXII43r8AB9uOai9QC2Q5sBQNR7dLlTtKJ/zCrIF6sc+JkzyUEp3jtnLAw35iPaLsER6/L6OOUwARPIpi5ijbTRxOGYmlJovAnkm+5K2CzVUe13jKLh+joool/ReZk0Rsr4tVLSLmvzDA/sRwYun0x0+jl5EZSQfwsVyN9bD5rY/In/EuvH9yj5R4lPe+mimF4Os6IgTsP5LzqDTAiFx5NNioFRJ2SkcTmM0CZQeMIBuvvF2HCtJlDEfCytD7wYup3GBvar2ccOe9T3YhJdsj5bfAJHVJtamxQwQKBgQDnYReMMzqAh2HOFL8QymzOjImsrOz6NCZatq38TU1hSe9PK+C0sFGhkd788y4AuURS1Btu4i7F+hOYcj1z3L+NSPGE3yLHVjakMrrNbA9rwG/t7oU0cG7d0WWM9bcTQiCSNcUyt69BGH3dZdqee1tITzqghE7+gh9RYiVcI6/8LwKBgQDSYEuWFLMUsR/s7unSHCucuEXjwbYrvknv8Y81sjvrWktNXrJoYlbGy/7HYA6lxzchtSxhPuUSjopwQ5scgMhqf8Gxz7jsDN9ak2dErF7cWRFYfh6aKhkbEw9oG01jIX15MK0TbMafoJslDhPQF1cP9i0+ZGg+gPbASdeUVRTNoQKBgQCOjwDOLgYeiMtXCOtL8hymCmsNDCKaaiUzgRijuhEyHzamJhe13Gj/TnwAh+hRI9UX333jjNJawqDuLXz1dQ5Eg6vjPQQVo2XZNzRnOuwpbJDKHUrPK3Lzkn+qIP6ii/y7eQu+GvSM/AUYsxfGy6RLYh1yJvLw1sVrBDiWk5prmwKBgFvgrmI3XBa3XKgPl5KptupVGEDmAveLvaLLLq5WzxB0eNqrduNbv2ZHBVhxvTPtk0hnZaB65XR7SD7LZ9zE6cKJVUCg5bRB0vIt2jYFydAWHhs1yYuuwxQt+NaQxfV7VN8uwQfww7ZHYDqIsWJ6Lw3Lh+rt0xEpJZrJJRulJNbBAoGBAK1OEnfBpSB99N8gdhp+ZGLsDfwFCQ2Cd4Jpsd4hxdwbXevNuA1OiE20sHPuKqEqfOKocgTMobCwbSfnymatRydVoeUumkEc4Ja+XDgH+P1eXQLdIuRCwh0AXl+vkuOCBDMw367Zp/j6vwPlNKh9ZmOBPwhV0Syv2Z8uGkTZ6g+f";
        publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2ZDIp5FlbfLG6p8abeS6\n" +
                "+ipdhcGF6XcF4K625E18kjqo/ND1cJuMBg8pjQjw1oYB9a0tyuddr4/veh/+ycFa\n" +
                "vO8NSLUIGRgEldqhRuFbRkSEO+hmrFkhAVCRoOfD/yvkQvb2Pwr+86KirPfD1uo5\n" +
                "Up9cY9h0F2ge0uYl9LGbsd9gQYoAgA0eNysrrnO6wr5JMZjTi9fRBW0nU+5jEpdU\n" +
                "7J0dl9pm/5iG7AnA3TDLkLLeItVz6gemi/0K5U+ALrEoiBEVugOdKyl/UDDqp+nP\n" +
                "F6JlEjoImuQUoqsJ1kcu6X2+/BQWIP8WnQVVo9Lgr7NFcIjRfQvJDpZ8OudWfi1u\n" +
                "ewIDAQAB";
        privateKey = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDZkMinkWVt8sbq\n" +
                "nxpt5Lr6Kl2FwYXpdwXgrrbkTXySOqj80PVwm4wGDymNCPDWhgH1rS3K512vj+96\n" +
                "H/7JwVq87w1ItQgZGASV2qFG4VtGRIQ76GasWSEBUJGg58P/K+RC9vY/Cv7zoqKs\n" +
                "98PW6jlSn1xj2HQXaB7S5iX0sZux32BBigCADR43Kyuuc7rCvkkxmNOL19EFbSdT\n" +
                "7mMSl1TsnR2X2mb/mIbsCcDdMMuQst4i1XPqB6aL/QrlT4AusSiIERW6A50rKX9Q\n" +
                "MOqn6c8XomUSOgia5BSiqwnWRy7pfb78FBYg/xadBVWj0uCvs0VwiNF9C8kOlnw6\n" +
                "51Z+LW57AgMBAAECggEAJ9LUp7d5dXKm7nNJByyC/R+cFsuhk2Zx8PqKB6gXUTzj\n" +
                "icNF6eLO8pz74hDs5JeK7ElSxH0tLOGP2C7bGFsIHOU07UYVwWIgFL38H1lIt8f6\n" +
                "3GxhvtJhtDfnMCi8O4zxL0C9OjTtDfOLC1YexswAyhrZcn1AYrhwS/JMqEmKUjhW\n" +
                "ehAmY/f92tKJavBrayNNA7OL7sp6zWo8wwWd0mAe9nvTvsuS+uzpV+no1Ki8jVVs\n" +
                "T4I55tsXX7/QbiXrJZ8p+xlmXXJ5NwHFGbRErZUcrdAIwCLDGtjTz894fuzxAdUg\n" +
                "WyuodeIMaAVl5ShgbfZd8qWzcSYuiUgYJi4QixczIQKBgQD7DwBxuVqdU5H4OZHj\n" +
                "9/aDOqRH/1/fv+oQNnSjbTq/JB3avHzbTt1yzFIEtbVHTP2HhcvSVA/Sawt3DYPa\n" +
                "9969AIlw6FsyGFjc4mLx4wmqOk1P/n05Yit1HhFQMqM9aqf5LQlUT0cW8CZaMuAj\n" +
                "FjHkVrv47fzxH5Qxl+LgqyaLPwKBgQDd2QWqAQiuEhy9Bz0KXC3HAqNJ2wkGBEYC\n" +
                "mfe5gARgt8rCPv9Es4zOiVOBHUp+PrcYiRgc0zyVKAvHnZ0uUKMjWbQr4sw2oThY\n" +
                "xd5lT0tPZc+FlI8SXfC8A+Pl5A7RVximTc3REOsU4t3U43SKwmtbnbEPC09iOy5O\n" +
                "xV74kuz5xQKBgFzbv55QoGNwdZ0KLhvTqyn+lqTKn/tyUHCOs7V+wSvRf/lXnha/\n" +
                "pMjBKdT0IIiuwVdO9YRl8zQww5zVMt/arlfZyvwn9RMiTjvkwBQXlYuQ5OehiU+g\n" +
                "L9KxvFWdZSNiP566OaklaXXifUz/ZEeV/f4m1n/MBrJoq7dsJk5S/36hAoGAO493\n" +
                "eNP8O5e7RXi7B5wF4kcwBbUbsBTXov0pSBE5m6ncctgs+onmBNFTrPdrN4eo6ppr\n" +
                "8dk4i6cLupTzTSrzEZuUxq+GOiiAkzzUX4ixZGimFWv0GW9FIYU920umOsfSY1vC\n" +
                "JR4QrzPVcMF8WYCnCBrHHY3gyzOuVBGjVMNFgi0CgYBXOTyfHUSkPKM72+llal1T\n" +
                "wR40xLxoo0LPqexnzjmtou12Vffe3V67VfbBdZfohW6nh6/cxu6YwtZwLbUecnaq\n" +
                "Y5Nq5jwioYl9rgV3/NPMwHAL8VM8ppbL/xK/cNTGNI4K33nud9rUhV8K/rv7sMZh\n" +
                "9L/BLfCDZTm2iz8vIHPv/g==";


        System.err.println("公钥加密——私钥解密");
        String source = "zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006zxh3609006";
        System.out.println("加密前字符串长度"+source.length());
        System.out.println("\r加密前文字：\r\n" + source);
        String aData = RSAUtil.encrypt(publicKey, source);
        System.out.println("加密后文字：\r\n" + aData);
        String dData = RSAUtil.decrypt(privateKey, aData);
        System.out.println("解密后文字: \r\n" + dData);
        System.out.println("解密后字符串长度"+dData.length());


    }
}
