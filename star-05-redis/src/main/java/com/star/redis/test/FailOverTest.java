package com.star.redis.test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

/**
 * <p>
 *
 * </p>
 *
 * @created： 2020-03-04
 * @author： xingxingzhao
 */
public class FailOverTest {

  private final static Logger logger = LoggerFactory.getLogger(FailOverTest.class);
  public static void main(String[] args) {

    String name = "mymaster";
    Set<String> objects = new HashSet<>();
    objects.add("116.196.93.190:26379");
    objects.add("116.196.93.190:26380");
    objects.add("116.196.93.190:26381");
    JedisSentinelPool sentinelPool = new JedisSentinelPool(name, objects);

    while (true){

      Jedis jedis = null;

      try {
        jedis = sentinelPool.getResource();

        int index = new Random().nextInt(1000);
        String key = "key-" + index;
        String value = "v-" + index;
        jedis.set(key, value);

        logger.info("{} value is {}", key , jedis.get(key));

        TimeUnit.SECONDS.sleep(2);
      } catch (Exception e){

        logger.error(e.getMessage(), e);
      } finally {

        if (jedis != null){
          jedis.close();
        }
      }
    }
  }
}
