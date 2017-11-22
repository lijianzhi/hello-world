package com.BestPay.Test;

import org.redisson.Config;
import org.redisson.Redisson;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class RedisTest {
    public static void main(String[] args) {
        Config config=new Config();
        config.setConnectionPoolSize(10);
        config.addAddress("127.0.0.1:6379");
        Redisson redisson=Redisson.create(config);
        System.out.println("连接redis");
        ConcurrentMap<String, Object> map=redisson.getMap("FirstMap");
        map.put("czy", "男");
        map.put("yinan", "男");
        map.put("pengfei", "女");

        ConcurrentMap resultmap=redisson.getMap("FirstMap");
        System.out.println("resultmap="+resultmap.keySet());

        Set myset=redisson.getSet("MySet");
        myset.add("czy");
        myset.add("pengfei");

        Set resultSet=redisson.getSet("MySet");
        System.out.println("resultset="+ Arrays.toString(resultSet.toArray()));

        //3.测试Queue队列
        Queue myQueue = redisson.getQueue("FirstQueue");
        myQueue.add("wuguowei");
        myQueue.add("lili");
        myQueue.add("zhangsan");
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());

        Queue resultQueue=redisson.getQueue("FirstQueue");
        System.out.println("resultQueue==="+resultQueue);
        // 关闭连接
        redisson.shutdown();
    }
}
