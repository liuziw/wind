package com.lzw.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;




public class AES
{
  public static String encrypt(String plainText, String aesKey)
  {
    try
    {
      byte[] byteContent = plainText.getBytes("utf-8");
      IvParameterSpec zeroIv = new IvParameterSpec("0102030405060708".getBytes());
      SecretKeySpec secretKey = new SecretKeySpec(aesKey.getBytes(), "AES");
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(1, secretKey, zeroIv);
      byte[] byteEnc = cipher.doFinal(byteContent);
      return new BASE64Encoder().encode(byteEnc);
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
      e.printStackTrace();
    } catch (BadPaddingException e) {
      e.printStackTrace();
    } catch (InvalidAlgorithmParameterException e) {
      e.printStackTrace();
    }
    return "";
  }

  public static String decrypt(String encryStr, String aesKey)
  {
    try
    {
      byte[] content = new BASE64Decoder().decodeBuffer(encryStr);
      IvParameterSpec zeroIv = new IvParameterSpec("0102030405060708".getBytes());
      SecretKeySpec secretKey = new SecretKeySpec(aesKey.getBytes(), "AES");
      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      cipher.init(2, secretKey, zeroIv);
      byte[] byteDec = cipher.doFinal(content);
      return new String(byteDec, "UTF-8");
    }
    catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (NoSuchPaddingException e) {
      e.printStackTrace();
    } catch (InvalidKeyException e) {
      e.printStackTrace();
    } catch (IllegalBlockSizeException e) {
      e.printStackTrace();
    } catch (BadPaddingException e) {
      e.printStackTrace();
    } catch (InvalidAlgorithmParameterException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }
  
  public static void main(String[] args) {
  	String ciphertext = "1234567890123456";
//  	String str = "3fPc8JONSaH6mjW/BNgobOU3dQH8g/2sYpm57idV0QHVPw3aBU4HJRWEg9+0ChUcTiE8+UFg3iC2IeQriChhZRjOjUbX/2sDgZanLl0N41IHtX5XnC//CjLLaTiZkosL0nU0A2eAIAm4DkFW4Vh2zxWRktRAiyJwxBssx1AnVzc1Nllqc3cyYYizjLRHovSPkZE6FzaKkZt4TeQmb1CYxg==";
    String str = encrypt("nihsi",ciphertext);
  	System.out.println(AES.decrypt(str,ciphertext));
  }
}
