package com.lzw.common.encrypt.util;

import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * 加密工具类
 *
 * @author zhongsj
 * @date 2018/03/15
 */
@Slf4j
public class EncryptUtils {
    public static String DEFAULT_HASH_KEY = "huayunzhongsheng";
    public static String ENCODING = "UTF-8";
    /**
     * 3des加密
     */
    private static final String Algorithm = "DESede"; // 定义 加密算法,可用
    private static final List<byte[]> threeDesKeyBytesList = new ArrayList<>();



    public static class EncryptBO{
        private byte[] encryptedBytes;

        private int keyIndex;

        public EncryptBO() {
        }

        public EncryptBO(int keyIndex, byte[] encryptedBytes) {
            this.encryptedBytes = encryptedBytes;
            this.keyIndex = keyIndex;
        }

        public byte[] getEncryptedBytes() {
            return encryptedBytes;
        }

        public void setEncryptedBytes(byte[] encryptedBytes) {
            this.encryptedBytes = encryptedBytes;
        }

        public int getKeyIndex() {
            return keyIndex;
        }

        public void setKeyIndex(int keyIndex) {
            this.keyIndex = keyIndex;
        }
    }

    static {
        threeDesKeyBytesList.add(new byte[]{7, 32, 8, 50, 47, 56, 77, 30, 36, 50, 53, 39, 77, 9, 96, 45, 90, 53, 51, 8, 3, 24, 30, 16});
        threeDesKeyBytesList.add(new byte[]{9, 15, 72, 6, 32, 38, 37, 11, 36, 50, 70, 20, 79, 4, 58, 3, 76, 30, 88, 83, 6, 38, 64, 87});
        threeDesKeyBytesList.add(new byte[]{66, 23, 57, 78, 22, 82, 68, 36, 6, 50, 97, 60, 69, 20, 37, 4, 23, 10, 71, 4, 57, 68, 73, 25});
        threeDesKeyBytesList.add(new byte[]{64, 69, 81, 32, 51, 56, 53, 34, 56, 59, 52, 64, 19, 96, 43, 18, 73, 43, 54, 1, 79, 78, 80, 27});
        threeDesKeyBytesList.add(new byte[]{55, 87, 67, 84, 26, 24, 15, 26, 9, 68, 77, 93, 16, 12, 78, 80, 51, 39, 83, 54, 5, 28, 28, 60});
        threeDesKeyBytesList.add(new byte[]{4, 23, 14, 11, 66, 50, 45, 4, 93, 21, 86, 83, 56, 94, 37, 63, 83, 15, 73, 51, 77, 61, 35, 80});
        threeDesKeyBytesList.add(new byte[]{5, 31, 1, 94, 60, 50, 47, 66, 90, 29, 54, 42, 29, 78, 62, 22, 47, 63, 27, 73, 12, 93, 55, 88});
        threeDesKeyBytesList.add(new byte[]{12, 34, 13, 79, 6, 92, 41, 98, 93, 11, 19, 43, 49, 93, 28, 6, 58, 26, 48, 48, 58, 15, 66, 50});
        threeDesKeyBytesList.add(new byte[]{41, 24, 11, 16, 41, 18, 98, 61, 41, 68, 79, 98, 60, 1, 98, 45, 50, 59, 3, 80, 34, 19, 6, 11});
        threeDesKeyBytesList.add(new byte[]{76, 49, 70, 75, 47, 21, 67, 11, 45, 99, 1, 68, 13, 3, 69, 26, 49, 45, 72, 44, 59, 59, 30, 98});
        threeDesKeyBytesList.add(new byte[]{86, 56, 54, 62, 67, 64, 31, 68, 95, 52, 69, 34, 49, 22, 7, 84, 12, 9, 92, 3, 12, 18, 41, 57});
        threeDesKeyBytesList.add(new byte[]{16, 88, 73, 56, 22, 58, 47, 13, 93, 58, 13, 21, 89, 25, 18, 28, 85, 90, 58, 48, 23, 62, 38, 41});
        threeDesKeyBytesList.add(new byte[]{70, 94, 59, 16, 57, 28, 72, 44, 63, 35, 96, 1, 67, 36, 93, 11, 35, 82, 67, 19, 15, 18, 17, 13});
        threeDesKeyBytesList.add(new byte[]{84, 93, 53, 52, 17, 24, 67, 12, 28, 43, 58, 47, 80, 4, 62, 69, 28, 65, 36, 8, 93, 74, 97, 51});
        threeDesKeyBytesList.add(new byte[]{1, 56, 3, 41, 27, 58, 99, 46, 42, 82, 43, 1, 65, 39, 50, 96, 24, 71, 14, 84, 50, 80, 99, 10});
        threeDesKeyBytesList.add(new byte[]{21, 51, 94, 31, 29, 79, 42, 6, 72, 2, 23, 45, 43, 42, 91, 3, 98, 83, 8, 12, 8, 64, 37, 14});
        threeDesKeyBytesList.add(new byte[]{3, 34, 48, 72, 31, 83, 84, 22, 10, 32, 99, 33, 34, 53, 98, 92, 33, 46, 27, 51, 96, 21, 4, 27});
        threeDesKeyBytesList.add(new byte[]{24, 70, 66, 8, 31, 49, 56, 61, 25, 90, 76, 9, 89, 98, 29, 86, 99, 89, 18, 88, 1, 11, 1, 20});
        threeDesKeyBytesList.add(new byte[]{3, 6, 60, 83, 98, 93, 20, 17, 20, 9, 58, 20, 12, 69, 67, 43, 9, 86, 86, 57, 50, 91, 23, 95});
        threeDesKeyBytesList.add(new byte[]{26, 47, 37, 21, 92, 19, 94, 89, 14, 76, 12, 60, 9, 3, 86, 76, 84, 44, 82, 67, 12, 61, 52, 15});
        threeDesKeyBytesList.add(new byte[]{96, 15, 55, 40, 86, 1, 83, 25, 40, 88, 64, 51, 83, 84, 94, 14, 99, 89, 3, 25, 81, 15, 37, 95});
        threeDesKeyBytesList.add(new byte[]{1, 57, 59, 5, 58, 94, 59, 56, 77, 69, 35, 38, 74, 56, 85, 46, 39, 90, 91, 65, 37, 27, 49, 97});
        threeDesKeyBytesList.add(new byte[]{55, 99, 2, 32, 27, 31, 45, 37, 40, 10, 25, 49, 70, 83, 10, 3, 6, 3, 21, 82, 65, 86, 52, 6});
        threeDesKeyBytesList.add(new byte[]{40, 63, 54, 25, 81, 36, 89, 8, 65, 18, 37, 86, 45, 86, 94, 36, 60, 22, 85, 72, 85, 11, 30, 86});
        threeDesKeyBytesList.add(new byte[]{79, 54, 54, 53, 25, 37, 41, 67, 35, 34, 81, 77, 29, 7, 6, 37, 39, 77, 46, 7, 81, 52, 84, 7});
        threeDesKeyBytesList.add(new byte[]{10, 33, 92, 74, 22, 87, 65, 35, 47, 86, 15, 63, 3, 88, 87, 17, 87, 6, 31, 2, 90, 49, 89, 37});
        threeDesKeyBytesList.add(new byte[]{13, 51, 21, 60, 48, 50, 54, 56, 50, 48, 54, 26, 45, 49, 13, 86, 25, 4, 54, 50, 57, 85, 33, 11});
        threeDesKeyBytesList.add(new byte[]{88, 66, 20, 75, 42, 79, 11, 65, 37, 8, 62, 43, 64, 64, 40, 16, 79, 2, 7, 76, 69, 68, 36, 51});
        threeDesKeyBytesList.add(new byte[]{83, 68, 7, 55, 17, 61, 33, 5, 70, 10, 34, 59, 55, 94, 73, 79, 40, 7, 69, 86, 66, 61, 43, 77});
        threeDesKeyBytesList.add(new byte[]{58, 45, 96, 41, 63, 3, 7, 6, 28, 99, 66, 18, 88, 77, 33, 34, 78, 49, 27, 11, 28, 10, 80, 46});
        threeDesKeyBytesList.add(new byte[]{87, 38, 16, 45, 43, 8, 48, 48, 48, 56, 20, 68, 88, 72, 12, 18, 37, 77, 3, 45, 13, 44, 18, 53});
        threeDesKeyBytesList.add(new byte[]{5, 76, 15, 17, 49, 4, 94, 22, 11, 96, 64, 93, 34, 6, 43, 95, 62, 34, 91, 65, 50, 59, 97, 18});
        threeDesKeyBytesList.add(new byte[]{20, 26, 78, 98, 58, 83, 54, 33, 62, 26, 53, 48, 54, 10, 13, 25, 22, 8, 71, 13, 46, 9, 78, 29});
        threeDesKeyBytesList.add(new byte[]{4, 70, 57, 5, 63, 50, 78, 90, 17, 93, 94, 66, 67, 48, 84, 28, 39, 45, 96, 39, 42, 8, 17, 82});
        threeDesKeyBytesList.add(new byte[]{14, 85, 27, 83, 53, 64, 50, 67, 39, 52, 39, 2, 58, 96, 92, 14, 19, 13, 25, 33, 40, 97, 18, 89});
        threeDesKeyBytesList.add(new byte[]{91, 1, 66, 90, 63, 90, 58, 81, 36, 37, 88, 57, 94, 52, 2, 35, 53, 77, 24, 62, 73, 97, 98, 25});
        threeDesKeyBytesList.add(new byte[]{21, 83, 85, 60, 73, 19, 83, 58, 98, 84, 85, 91, 81, 8, 11, 79, 60, 14, 43, 64, 54, 19, 66, 63});
        threeDesKeyBytesList.add(new byte[]{21, 1, 87, 12, 95, 35, 42, 26, 29, 9, 9, 48, 20, 9, 60, 95, 84, 47, 7, 66, 96, 83, 43, 25});
        threeDesKeyBytesList.add(new byte[]{18, 84, 70, 61, 68, 28, 15, 88, 1, 54, 54, 85, 14, 4, 44, 27, 60, 36, 32, 8, 30, 19, 97, 87});
        threeDesKeyBytesList.add(new byte[]{73, 39, 43, 44, 45, 17, 91, 49, 34, 76, 30, 41, 82, 13, 50, 77, 3, 49, 9, 96, 80, 13, 80, 14});
        threeDesKeyBytesList.add(new byte[]{15, 14, 91, 22, 98, 26, 91, 11, 37, 72, 62, 50, 68, 75, 24, 38, 27, 33, 51, 83, 47, 19, 13, 62});
        threeDesKeyBytesList.add(new byte[]{92, 30, 21, 77, 3, 73, 71, 64, 53, 96, 57, 4, 86, 92, 44, 47, 63, 7, 95, 23, 43, 35, 18, 16});
        threeDesKeyBytesList.add(new byte[]{97, 36, 52, 50, 65, 72, 17, 69, 92, 94, 30, 98, 55, 47, 47, 92, 12, 77, 29, 62, 65, 50, 10, 75});
        threeDesKeyBytesList.add(new byte[]{6, 31, 13, 47, 92, 31, 19, 72, 8, 45, 48, 28, 81, 33, 16, 75, 85, 88, 69, 42, 99, 3, 55, 23});
        threeDesKeyBytesList.add(new byte[]{62, 89, 14, 63, 25, 60, 98, 4, 77, 90, 97, 16, 57, 74, 28, 17, 28, 99, 1, 33, 14, 61, 83, 68});
        threeDesKeyBytesList.add(new byte[]{28, 56, 5, 76, 42, 18, 24, 19, 83, 16, 45, 73, 12, 6, 64, 79, 12, 95, 18, 17, 43, 41, 65, 86});
        threeDesKeyBytesList.add(new byte[]{78, 48, 56, 44, 25, 91, 38, 11, 79, 73, 42, 74, 91, 91, 68, 17, 81, 73, 85, 20, 11, 63, 79, 48});
        threeDesKeyBytesList.add(new byte[]{71, 83, 53, 29, 38, 50, 40, 65, 38, 32, 11, 93, 65, 96, 70, 25, 23, 30, 45, 22, 55, 9, 54, 25});
        threeDesKeyBytesList.add(new byte[]{37, 8, 71, 38, 93, 7, 62, 73, 20, 65, 57, 61, 88, 23, 37, 54, 49, 95, 89, 98, 10, 68, 16, 83});
        threeDesKeyBytesList.add(new byte[]{7, 84, 14, 1, 34, 12, 10, 36, 78, 55, 45, 24, 76, 72, 96, 27, 46, 13, 66, 88, 60, 7, 82, 70});
        threeDesKeyBytesList.add(new byte[]{3, 41, 28, 60, 4, 3, 46, 10, 82, 92, 89, 24, 60, 13, 87, 93, 91, 19, 28, 75, 55, 85, 30, 29});
        threeDesKeyBytesList.add(new byte[]{49, 37, 22, 42, 57, 91, 23, 93, 96, 46, 82, 76, 78, 72, 80, 83, 56, 89, 99, 74, 32, 31, 84, 66});
        threeDesKeyBytesList.add(new byte[]{70, 34, 70, 35, 64, 26, 29, 41, 83, 18, 70, 91, 12, 98, 97, 17, 81, 85, 37, 37, 95, 30, 35, 69});
        threeDesKeyBytesList.add(new byte[]{50, 52, 40, 84, 83, 59, 92, 94, 81, 97, 59, 36, 88, 63, 30, 51, 52, 11, 50, 72, 57, 48, 27, 76});
        threeDesKeyBytesList.add(new byte[]{92, 25, 34, 43, 55, 89, 82, 38, 60, 14, 5, 16, 70, 67, 34, 38, 75, 28, 91, 35, 18, 37, 57, 76});
        threeDesKeyBytesList.add(new byte[]{59, 5, 81, 19, 44, 15, 79, 70, 51, 49, 20, 83, 9, 24, 52, 19, 27, 53, 36, 88, 70, 19, 6, 72});
        threeDesKeyBytesList.add(new byte[]{23, 91, 11, 47, 49, 84, 16, 56, 28, 70, 19, 36, 56, 47, 54, 59, 71, 15, 97, 60, 80, 67, 55, 42});
        threeDesKeyBytesList.add(new byte[]{19, 56, 31, 1, 8, 24, 17, 34, 89, 23, 5, 94, 26, 43, 61, 91, 61, 35, 20, 80, 68, 75, 64, 55});
        threeDesKeyBytesList.add(new byte[]{19, 69, 91, 51, 57, 19, 17, 3, 12, 28, 75, 17, 96, 36, 41, 68, 32, 47, 71, 16, 29, 80, 46, 61});
        threeDesKeyBytesList.add(new byte[]{85, 81, 80, 70, 96, 97, 12, 90, 71, 96, 34, 40, 90, 51, 58, 34, 87, 81, 18, 12, 2, 48, 41, 50});
        threeDesKeyBytesList.add(new byte[]{34, 83, 34, 14, 9, 3, 45, 65, 6, 50, 70, 23, 3, 44, 76, 77, 60, 2, 56, 69, 99, 17, 88, 86});
        threeDesKeyBytesList.add(new byte[]{23, 95, 93, 15, 25, 39, 40, 8, 78, 39, 45, 71, 61, 98, 44, 67, 73, 69, 54, 96, 72, 18, 87, 47});
        threeDesKeyBytesList.add(new byte[]{90, 53, 3, 59, 42, 70, 31, 23, 7, 33, 61, 10, 2, 47, 38, 3, 38, 8, 29, 80, 56, 44, 25, 73});
        threeDesKeyBytesList.add(new byte[]{65, 84, 96, 85, 69, 20, 19, 81, 32, 42, 39, 72, 6, 86, 71, 16, 44, 23, 99, 10, 23, 66, 81, 35});
        threeDesKeyBytesList.add(new byte[]{6, 47, 96, 65, 94, 71, 7, 70, 46, 27, 64, 98, 47, 43, 62, 30, 24, 10, 8, 17, 86, 77, 30, 62});
        threeDesKeyBytesList.add(new byte[]{84, 19, 44, 4, 75, 68, 90, 82, 67, 47, 31, 96, 28, 69, 76, 37, 72, 82, 7, 1, 41, 64, 18, 89});
        threeDesKeyBytesList.add(new byte[]{16, 96, 50, 1, 52, 33, 65, 9, 39, 16, 39, 77, 7, 66, 32, 86, 88, 2, 25, 18, 7, 52, 77, 11});
        threeDesKeyBytesList.add(new byte[]{74, 82, 32, 45, 27, 83, 77, 11, 36, 38, 92, 43, 11, 35, 97, 81, 23, 37, 56, 15, 98, 97, 30, 61});
        threeDesKeyBytesList.add(new byte[]{34, 52, 81, 52, 84, 94, 5, 5, 63, 8, 68, 50, 43, 83, 11, 51, 15, 9, 6, 22, 73, 11, 61, 21});
        threeDesKeyBytesList.add(new byte[]{96, 84, 30, 55, 69, 41, 52, 37, 44, 55, 93, 22, 66, 81, 41, 1, 27, 13, 12, 80, 88, 27, 54, 30});
        threeDesKeyBytesList.add(new byte[]{87, 96, 93, 70, 1, 54, 82, 50, 8, 54, 39, 37, 90, 51, 39, 53, 13, 90, 71, 52, 88, 60, 92, 92});
        threeDesKeyBytesList.add(new byte[]{63, 69, 67, 71, 89, 59, 94, 73, 9, 25, 1, 24, 66, 80, 83, 27, 51, 33, 33, 10, 26, 41, 59, 69});
        threeDesKeyBytesList.add(new byte[]{7, 23, 31, 83, 58, 10, 92, 86, 79, 14, 77, 47, 37, 87, 60, 34, 8, 25, 23, 25, 84, 70, 19, 17});
        threeDesKeyBytesList.add(new byte[]{32, 32, 85, 21, 93, 72, 56, 21, 37, 98, 59, 78, 34, 75, 80, 76, 40, 22, 31, 4, 90, 25, 10, 96});
        threeDesKeyBytesList.add(new byte[]{59, 22, 29, 47, 53, 24, 8, 86, 32, 20, 88, 62, 31, 1, 16, 12, 26, 71, 39, 24, 39, 73, 51, 58});
        threeDesKeyBytesList.add(new byte[]{87, 6, 71, 65, 49, 29, 25, 75, 17, 96, 17, 5, 94, 2, 44, 81, 83, 4, 92, 15, 12, 16, 94, 31});
        threeDesKeyBytesList.add(new byte[]{40, 98, 27, 25, 43, 17, 1, 25, 94, 99, 86, 2, 98, 5, 93, 97, 45, 66, 52, 72, 71, 3, 85, 42});
        threeDesKeyBytesList.add(new byte[]{62, 65, 77, 40, 37, 44, 98, 19, 36, 39, 2, 21, 60, 26, 18, 11, 5, 7, 83, 58, 23, 4, 9, 55});
        threeDesKeyBytesList.add(new byte[]{10, 13, 44, 83, 11, 11, 83, 14, 69, 1, 67, 58, 93, 56, 19, 59, 38, 47, 80, 64, 11, 77, 76, 90});
        threeDesKeyBytesList.add(new byte[]{4, 11, 71, 87, 95, 82, 61, 72, 79, 50, 22, 52, 29, 74, 57, 66, 32, 87, 69, 2, 99, 17, 98, 6});
        threeDesKeyBytesList.add(new byte[]{65, 34, 92, 22, 26, 7, 85, 60, 57, 46, 99, 38, 17, 62, 25, 20, 75, 43, 33, 66, 33, 62, 60, 37});
        threeDesKeyBytesList.add(new byte[]{8, 40, 72, 25, 72, 55, 81, 53, 69, 54, 17, 66, 88, 69, 38, 51, 12, 64, 11, 45, 52, 44, 59, 53});
        threeDesKeyBytesList.add(new byte[]{46, 51, 49, 99, 22, 52, 3, 63, 92, 21, 74, 8, 38, 81, 74, 31, 11, 57, 79, 70, 20, 59, 4, 15});
        threeDesKeyBytesList.add(new byte[]{48, 26, 79, 37, 13, 21, 97, 2, 74, 31, 82, 5, 1, 98, 76, 51, 47, 36, 36, 14, 36, 94, 99, 37});
        threeDesKeyBytesList.add(new byte[]{79, 38, 27, 82, 27, 68, 28, 84, 83, 85, 18, 89, 19, 53, 48, 75, 10, 63, 24, 23, 64, 19, 27, 27});
        threeDesKeyBytesList.add(new byte[]{16, 63, 92, 29, 53, 64, 61, 20, 31, 90, 45, 23, 62, 18, 86, 72, 43, 36, 6, 75, 38, 47, 83, 19});
        threeDesKeyBytesList.add(new byte[]{56, 36, 92, 61, 88, 78, 35, 17, 58, 89, 92, 83, 79, 20, 89, 70, 64, 31, 56, 58, 67, 20, 24, 33});
        threeDesKeyBytesList.add(new byte[]{87, 31, 67, 59, 76, 79, 49, 98, 57, 59, 90, 10, 15, 84, 25, 31, 99, 74, 75, 19, 77, 51, 20, 67});
        threeDesKeyBytesList.add(new byte[]{26, 34, 72, 85, 27, 22, 73, 98, 81, 31, 71, 98, 46, 32, 45, 18, 50, 26, 78, 9, 25, 69, 14, 62});
        threeDesKeyBytesList.add(new byte[]{60, 12, 91, 56, 77, 80, 35, 50, 52, 41, 11, 11, 87, 82, 32, 64, 48, 91, 1, 75, 23, 82, 38, 76});
        threeDesKeyBytesList.add(new byte[]{10, 15, 61, 63, 14, 1, 68, 86, 26, 33, 59, 23, 88, 21, 48, 39, 40, 79, 80, 19, 14, 2, 42, 33});
        threeDesKeyBytesList.add(new byte[]{44, 26, 15, 54, 31, 88, 58, 67, 75, 31, 94, 5, 65, 76, 92, 80, 98, 1, 53, 50, 25, 89, 34, 70});
        threeDesKeyBytesList.add(new byte[]{45, 58, 19, 49, 84, 28, 20, 27, 32, 27, 1, 49, 36, 42, 86, 81, 58, 87, 90, 89, 95, 26, 56, 45});
        threeDesKeyBytesList.add(new byte[]{71, 42, 42, 54, 65, 44, 29, 85, 28, 59, 5, 73, 51, 87, 71, 54, 72, 73, 13, 24, 92, 9, 82, 2});
        threeDesKeyBytesList.add(new byte[]{26, 33, 48, 81, 30, 32, 19, 41, 88, 71, 57, 75, 16, 39, 60, 36, 7, 20, 31, 53, 18, 95, 99, 34});
        threeDesKeyBytesList.add(new byte[]{99, 65, 99, 24, 60, 39, 55, 62, 76, 23, 95, 29, 36, 31, 17, 40, 52, 69, 8, 6, 3, 26, 42, 51});
        threeDesKeyBytesList.add(new byte[]{68, 14, 32, 9, 81, 97, 53, 90, 41, 78, 21, 1, 80, 66, 85, 20, 90, 18, 39, 34, 78, 39, 39, 73});
        threeDesKeyBytesList.add(new byte[]{85, 30, 14, 73, 83, 72, 9, 11, 94, 12, 87, 86, 5, 85, 76, 98, 96, 28, 46, 92, 53, 81, 26, 77});
        threeDesKeyBytesList.add(new byte[]{63, 42, 29, 43, 55, 65, 57, 1, 44, 69, 5, 16, 70, 4, 14, 73, 26, 40, 79, 20, 53, 54, 42, 91});
        threeDesKeyBytesList.add(new byte[]{77, 58, 57, 11, 43, 81, 3, 27, 27, 66, 47, 4, 38, 49, 65, 88, 16, 7, 40, 10, 82, 99, 67, 28});
    }


    public static int threeDesKeyBytesListSize() {
        return threeDesKeyBytesList.size();
    }

    //private static IdCreator idCreator;
    //使用shiro的加密方式,一并不用
    //public static String encryptBySha256111(String str) {
    //    return new Sha256Hash(str, EncryptUtils.DEFAULT_HASH_KEY).toHex();
    //}

    /**
     * sha256加密
     *
     * @param str  需要加密的字符串
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
     * 产生Token
     */
    public static String makeToken() {
        return makeUUID();
    }

    /**
     * 3Des加密
     *
     * @param keyIndex
     * @param src
     * @return
     */
    public static byte[] encrypt3Des(int keyIndex, byte[] src) {
        return encrypt3Des(threeDesKeyBytesList.get(keyIndex), src);
    }

    /**
     * 加密方法
     *
     * @param keybyte 加密密钥，长度为24字节
     * @param src     被加密的数据缓冲区（源）
     * @return
     * @author 来源网络, liys
     * @date 2015-8-18
     */
    public static byte[] encrypt3Des(byte[] keybyte, byte[] src) {

        try {
            // 生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);

            // 加密
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.ENCRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (Exception e) {
            throw CommonException.exception("加密失败", e);
        }
    }

    /**
     * 3Des解密
     *
     * @param keyIndex
     * @param src
     * @return
     */
    public static byte[] decrypt3Des(int keyIndex, byte[] src) {
        return decrypt3Des(threeDesKeyBytesList.get(keyIndex), src);
    }

    /**
     * 解密
     *
     * @param keybyte 加密密钥，长度为24字节
     * @param src     加密后的缓冲区
     * @return
     * @author 来源网络, liys
     * @date 2015-8-18
     */
    public static byte[] decrypt3Des(byte[] keybyte, byte[] src) {
        log.warn("keybyte={}",getBytesString(keybyte));
        log.warn("src={}",getBytesString(src));
        try {
            // 生成密钥
            SecretKey deskey = new SecretKeySpec(keybyte, Algorithm);
            // 解密
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.DECRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (Exception e) {
            throw CommonException.exception("解密失败", e);
        }
    }


    public static String getBytesString(byte[] bytes){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<bytes.length;i++){
            if(i!=0){
                sb.append("|");
            }
            sb.append(bytes[i]);
        }
        return sb.toString();
    }

    public static  EncryptBO encryptWithKeyIndex(String source){
        int keyIndex=new Random().nextInt(threeDesKeyBytesList.size());
        byte[] keyBytes=threeDesKeyBytesList.get(keyIndex);
        byte[] src=source.getBytes();
        byte[] result=encrypt3Des(keyBytes,src);
        return new EncryptBO(keyIndex,result);
    }

    public static  byte[] decryptWithKeyIndex(int keyIndex,byte[] src){
        return decrypt3Des(keyIndex,src);
    }

    /**
     * 生成签名
     * <pre>
     *     签名参数格式：signature={yyyyMMdd-uuid};{keyIndex};{encryptSignature}
     *          yyyyMMdd：前当日期
     *          uuid:全局唯一
     *          keyIndex:加密key的索引
     *          encryptsignature:加密码后的字符串
     * </pre>
     * @return
     */
    public static String createSignature(){
        //当前日期
        String nowDate = CommonUtils.getNowDateStr();
        //uuid
        String uuid = UUID.randomUUID().toString().replace("-","");
        //yyyyMMdd-uuid
        StringBuilder stringBuilder = new StringBuilder(nowDate);
        stringBuilder.append("-");
        stringBuilder.append(uuid);
        String dateAndUUid = stringBuilder.toString();
        //keyIndex
        Integer keyIndex = RandomUtils.nextInt(threeDesKeyBytesListSize());

        //将yyyyMMdd-uuid加密
        byte [] encryBytes = encrypt3Des(keyIndex,dateAndUUid.getBytes());
        String encryptSignature = getBytesString(encryBytes);

        //拼接签名格式 signature={yyyyMMdd-uuid};{keyIndex};{encryptSignature}
        StringBuilder stringBuilder1 = new StringBuilder("");
        stringBuilder1.append(dateAndUUid);
        stringBuilder1.append(";");
        stringBuilder1.append(keyIndex);
        stringBuilder1.append(";");
        stringBuilder1.append(encryptSignature);
        String signature = stringBuilder1.toString();

        return signature;
    }

    /**
     * 验证签名
     * <pre>
     *     验证signature格式
     *     将yyyyMMdd-uuid加密，与encryptSignature进行比较，如果相同则校验通过，否则校验失败
     * </pre>
     * @param signature
     * @return
     */
    public static boolean signatureValidate(String signature){
        if(StringUtils.isEmpty(signature)){
            return false;
        }
        //得到前面参数
        String [] signatrueArr = null;
        String dateAndUuidStr;
        Integer keyIndex;
        String encryptSignature;
        try {
            signatrueArr = signature.split(";");
            dateAndUuidStr = signatrueArr[0];
            keyIndex = Integer.parseInt(signatrueArr[1]);
            encryptSignature = signatrueArr[2];
        } catch (Exception e){
            throw CommonException.exception("标签参数格式有误！",e);
        }

        byte [] encrtptByte = EncryptUtils.encrypt3Des(keyIndex,dateAndUuidStr.getBytes());

        if(encrtptByte == null){
            return false;
        }
        String encryptStr = EncryptUtils.getBytesString(encrtptByte);
        //当后台加密与前台传过来的加密字符串一致时校验通过
        if(encryptSignature.equals(encryptStr)){
            return true;
        }

        return false;
    }

}
