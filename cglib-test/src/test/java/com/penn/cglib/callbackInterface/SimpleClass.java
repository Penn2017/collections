package com.penn.cglib.callbackInterface;

/**
 * @Description :
 * @Project : collections
 * @Program Name  : com.penn.cglib.callbackInterface.SimpleClass
 * @Author : zhongpingtang@yiruntz.com 唐忠平
 */
public class SimpleClass {


    public SimpleClass(){
        System.out.println("I'm SimpleClass's Constror...");
    }

    public String  sayHello(){
        return "hello world!";
    }


    public void sayBye(){
        System.out.println("bye bye!");
    }

}
