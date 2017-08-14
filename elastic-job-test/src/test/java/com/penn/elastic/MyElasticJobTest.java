package com.penn.elastic;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description :
 * @Project : collections
 * @Program Name  : com.penn.elastic.MyElasticJobTest
 * @Author : zhongpingtang@yiruntz.com 唐忠平
 */
public class MyElasticJobTest {


    private ApplicationContext applicationContext;

    @Before
    public void before(){
        applicationContext = new ClassPathXmlApplicationContext("spring-main.xml");
    }

    @Test
    public void testElasticJob() throws InterruptedException {
        Thread.sleep(1000 * 60);
    }

}