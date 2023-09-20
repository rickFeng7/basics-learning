package com.rick.guava.ratelimiter;

import com.google.common.util.concurrent.RateLimiter;
import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

/**
 * @author fengrui
 * @date 2023/9/20
 */
public class RateLimiterDemo {
    @SneakyThrows
    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(1);
        for (int i = 0; i < 10; i++) {
            CompletableFuture.runAsync(() -> {
                rateLimiter.acquire();
                System.out.println("-----------");
            });
        }
        Thread.sleep(20000);
    }
}
