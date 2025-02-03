package com.ghouse.apiwarehouse.common.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.concurrent.TimeUnit;

@Configuration
public class JedisConfig {

    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.redis.port}")
    private int redisPort;

    @Value("${spring.redis.password}")
    private String redisPassword;

    @Bean
    public JedisPool jedisPool() {
        final JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(128);
        poolConfig.setMinIdle(12);
        poolConfig.setMaxWaitMillis(TimeUnit.MINUTES.toMillis(15));
        return new JedisPool(poolConfig, redisHost, redisPort, (int) TimeUnit.SECONDS.toMillis(10), redisPassword);
    }
}