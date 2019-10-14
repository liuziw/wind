package com.lzw.test;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.MultimediaInfo;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
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


    public static void main(String[] args) {
        Long start = new Date().getTime();
        File source = new File("E:\\work\\智能质检\\录音文件\\王旭伟\\王旭伟\\213201900035768.WAV");
        Encoder encoder = new Encoder();
        try {
            MultimediaInfo m = encoder.getInfo(source);
            long ls = m.getDuration();
            int second = (int) (ls / 1000);
            Long end = new Date().getTime();
            System.out.println("花费(毫秒)"+(end-start));
            System.out.println("此视频时长为:" + second + "秒！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
