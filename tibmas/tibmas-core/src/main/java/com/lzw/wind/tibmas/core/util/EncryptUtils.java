package com.lzw.wind.tibmas.core.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * 加密工具类
 *
 * @author zhongsj
 * @date 2018/03/15
 */
public class EncryptUtils {
    public static String DEFAULT_HASH_KEY = "huayunzhongsheng";
    public static String ENCODING = "UTF-8";


    //private static IdCreator idCreator;
    //使用shiro的加密方式,一并不用
    //public static String encryptBySha256111(String str) {
    //    return new Sha256Hash(str, EncryptUtils.DEFAULT_HASH_KEY).toHex();
    //}
    /**
     * sha256加密
     *
     * @param str     需要加密的字符串
     * @param salt 加密用的key
     * @return
     */
    public static String encryptBySha256(String str, String salt) {
        MessageDigest messageDigest;
        String encodeStr = "";
        try {

            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(salt.getBytes(ENCODING));
            byte[] hashed = messageDigest.digest(str.getBytes(ENCODING));
            // 首先初始化一个字符数组，用来存放每个16进制字符
            char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            // new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））
            char[] resultCharArray = new char[hashed.length * 2];
            // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
            int index = 0;
            for (byte b : hashed) {
                resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
                resultCharArray[index++] = hexDigits[b & 0xf];
            }
            return new String(resultCharArray);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * sha256加密
     * 使用默认的hashkey
     *
     * @param str 加密的字符串
     * @return
     */
    public static String encryptBySha256(String str) {
        return encryptBySha256(str, EncryptUtils.DEFAULT_HASH_KEY);
    }

    /**
     * md5加密
     *
     * @param str 需要加密的字符串
     * @return
     */
    public static String encryptByMD5(String str) {
        try {
            byte[] textBytes = str.getBytes();
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(textBytes);
            byte[] resultByte = digest.digest();
            // 首先初始化一个字符数组，用来存放每个16进制字符
            char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            // new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））
            char[] resultCharArray = new char[resultByte.length * 2];
            // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
            int index = 0;
            for (byte b : resultByte) {
                resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
                resultCharArray[index++] = hexDigits[b & 0xf];
            }
            // 字符数组组合成字符串返回
            return new String(resultCharArray);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 生成GUID
     *
     * @return
     */
    public static String makeUUID() {
        UUID uuid = UUID.randomUUID();
        String guid = uuid.toString();
        return guid.replace("-", "");
    }

    /**
     * 产生ID
     *
     * @return
     */
//    public static String makeId() {
//        if(idCreator==null)
//        {
//            throw new RRException("idCreator没有设置");
//        }
//        return idCreator.createStringId();
//    }

    /**
     * 产生Token
     */
    public static String makeToken() {
        return makeUUID();
    }

}
