package com.lzw.test;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.MultimediaInfo;
import org.apache.commons.io.FileUtils;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;
import java.net.URL;
import java.util.Date;

/**
 * @author liuziw
 * @date 2019/8/21 9:17
 */
public class AudioTimeTest {

    /**
     * 获取音频文件时长
     *
     * @param wavFilePath wav文件路径，支持本地和网络HTTP路径
     * @return 时长/微秒，可 /1000000D 得到秒
     * @throws Exception
     */
    public static long getMicrosecondLengthForWav(String wavFilePath) throws Exception {

        if (wavFilePath == null || wavFilePath.length() == 0) {
            return 0;
        }
        String bath = wavFilePath.split(":")[0];
        Clip clip = AudioSystem.getClip();
        AudioInputStream ais;
        if ("http".equals(bath.toLowerCase())||"https".equals(bath.toLowerCase())) {
            ais = AudioSystem.getAudioInputStream(new URL(wavFilePath));
        } else {
            ais = AudioSystem.getAudioInputStream(new File(wavFilePath));
        }
        clip.open(ais);
        return clip.getMicrosecondLength();
    }

    public static void main1(String [] args)throws Exception {
        Long start = new Date().getTime();
        String url = "E:\\work\\智能质检\\录音文件\\王旭伟\\王旭伟\\213201900040838.WAV";
        Long time = getMicrosecondLengthForWav(url)/1000000;
        Long end = new Date().getTime();
        System.out.println("花费(毫秒)"+(end-start));
        System.out.println("时长为（秒）"+time);
    }


    public static void main(String[] args) throws Exception {
        /*Long start = new Date().getTime();
//        File source = new File("E:\\work\\智能质检\\录音文件\\非标准采样率 - 副本\\测试录音3.wav");
//        File source = new File("E:\\work\\智能质检\\录音文件\\王旭伟\\王旭伟\\213201900024968.WAV");
        File source = new File("C:\\\\Users\\\\Administrator\\\\Desktop\\\\9.wav");
        Encoder encoder = new Encoder();
        try {
            MultimediaInfo m = encoder.getInfo(source);
            Integer sampleTate = m.getAudio().getSamplingRate();
            long ls = m.getDuration();
            int second = (int) (ls / 1000);
            Long end = new Date().getTime();
            System.out.println("花费(毫秒)"+(end-start));
            System.out.println("此视频时长为:" + second + "秒！");
            System.out.println("此视频采样率为:" + sampleTate);
            System.out.println("此视频声道为:" + m.getAudio().getChannels());
            System.out.println("此视频比特率为:" + m.getAudio().getBitRate());
            System.out.println("此视频编码为:" + m.getAudio().getDecoder());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*testCompressMp3Samll("C:\\\\Users\\\\Administrator\\\\Desktop\\\\9.wav",
                "E:\\work\\智能质检", 16000);*/

        convertBit("C:\\Users\\Administrator\\Desktop\\9.wav", "C:\\Users\\Administrator\\Desktop\\9_bak.wav");
    }

    /**
     *
     * @param inputFilePath 需要处理的文件地址
     * @param outputDirPath 处理后的文件输出目录
     * @param samplingRate 采样率
     * @throws Exception
     */
    public static void testCompressMp3Samll(String inputFilePath, String outputDirPath, Integer samplingRate) throws Exception{
        Long t1 = System.currentTimeMillis();
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setSamplingRate(samplingRate);//设置采样率
        audio.setChannels(1); //设置声道
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("wav");//设置格式
        attrs.setAudioAttributes(audio);
        Encoder encoder = new Encoder();
        File inputFile = new File(inputFilePath);
        File outFile = new File(outputDirPath+"\\"+inputFile.getName());
        encoder.encode(inputFile, outFile, attrs);
        FileUtils.copyFile(outFile, inputFile);
        Long t2= System.currentTimeMillis();
        System.out.println("消耗："+(t2-t1)+"ms");
    }

    /**
     * 8位采样精度转16位采样精度
     * @param inputFilePath
     * @param outFilePath
     * @return
     * @throws Exception
     */
    public static File convertBit(String inputFilePath, String outFilePath) throws Exception {
        File file = new File(inputFilePath);
        byte [] bytesIn = readInputStream(new FileInputStream(file));
        byte [] bytesOut = convert8bitTo16bit(bytesIn);
        InputStream inputStream = new ByteArrayInputStream(bytesOut);
        File fileOut = new File(outFilePath);
        FileUtils.copyInputStreamToFile(inputStream, fileOut);
        return fileOut;
    }


    /**
     * 从输入流中获取字节数组
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }


    /**
     * 8bit ->16bit
     * @param orig
     * @return
     */
    public static byte[] convert8bitTo16bit(byte[] orig) {
        byte[] dest = new byte[]{};
        for (int i=0;i<orig.length;i++){
            // 转无符号整数
//      int sample = orig[i] & 0xff;
//      sample = sample - 128;
//      int s1 = (int) (sample * 1.0 / 256 * Short.MAX_VALUE);
            int s1 = (orig[i]+128)<<8;
            byte[] byte2 = new byte[2];
            byte2[1] = (byte) ((s1 << 16) >> 24);
            byte2[0] = (byte) ((s1 << 24) >> 24);
            dest = append(dest, byte2);
        }
        return dest;
    }


    /**
     * 拼接byte[]
     *
     * @param orig 原始byte[]
     * @param dest 需要拼接的数据
     * @return byte[]
     */
    public static byte[] append(byte[] orig, byte[] dest) {

        byte[] newByte = new byte[orig.length + dest.length];

        System.arraycopy(orig, 0, newByte, 0, orig.length);
        System.arraycopy(dest, 0, newByte, orig.length, dest.length);

        return newByte;

    }
}
