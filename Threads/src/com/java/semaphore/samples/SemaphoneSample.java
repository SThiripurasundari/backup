package com.java.semaphore.samples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class SemaphoneSample {

public static void main(String[] args) throws Exception {
        
        ExecutorService executor = Executors.newCachedThreadPool();
        
        //200 thread will be created but access will be given to only 10 connection objects 
        //and that implementation is dine using Semaphore 
        for(int i=0; i < 200; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    try {
						Connections.getInstance().connect();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            });
        }
        
        executor.shutdown();
        
        executor.awaitTermination(1, TimeUnit.DAYS);
    }
}
