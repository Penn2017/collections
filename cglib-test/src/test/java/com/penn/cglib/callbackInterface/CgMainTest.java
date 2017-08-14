package com.penn.cglib.callbackInterface;

import net.sf.cglib.beans.BeanMap;
import net.sf.cglib.proxy.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description :
 * @Project : collections
 * @Program Name  : com.penn.cglib.callbackInterface.CgMainTest
 * @Author : zhongpingtang@yiruntz.com 唐忠平
 */
public class CgMainTest {

    private Enhancer enhancer = new Enhancer();


    @Before
    public void before(){
        enhancer.setSuperclass(SimpleClass.class);
    }


    @Test
    public void testNoOp(){
        enhancer.setCallback(NoOp.INSTANCE);

        SimpleClass simpleClass = (SimpleClass) enhancer.create();
        System.out.println(simpleClass.sayHello());


    }


    @Test
    public void testLazyLoader(){
        enhancer.setCallback((LazyLoader) () -> (FixedValue) () -> "hello LazyLoader");
        System.out.println(enhancer.create());

    }

    @Test
    public void testDispatcher(){
        enhancer.setCallback((Dispatcher) () -> "hello Dispathcer1...");
        System.out.println(enhancer.create());
        enhancer.setCallback((Dispatcher) () -> "hello Dispathcer2....");
        System.out.println(enhancer.create());

    }

    @Test
    public void testBeanMap(){
        BeanMap beanMap = BeanMap.create(SimpleClass.class);

    }

}