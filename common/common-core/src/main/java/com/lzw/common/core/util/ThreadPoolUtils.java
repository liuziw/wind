package com.lzw.common.core.util;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/6/27 15:05
 */
public class ThreadPoolUtils {

    private static ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void  runAsync(Runnable runnable){

        CompletableFuture.runAsync(runnable,executor);
    }

}
