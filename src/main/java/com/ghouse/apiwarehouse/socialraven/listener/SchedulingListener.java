package com.ghouse.apiwarehouse.socialraven.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.PostConstruct;


@Component
public class SchedulingListener {

    @Autowired
    private JedisPool jedisPool;

    private Jedis jedis;

    @PostConstruct
    public void init(){
        jedis = jedisPool.getResource();
    }

    @Scheduled(fixedDelay = 30000)
    public void pullMessagesPeriodically() {
        String totalPostsRemaining = jedis.get("Total_Posts_Remaining");
        System.out.println("totalPostsRemaining : "+totalPostsRemaining);
    }
}
