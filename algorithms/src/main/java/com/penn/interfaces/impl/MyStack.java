package com.penn.interfaces.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Stack;

/***
 * 编写一个逻辑栈，要求这个栈可以获取当前栈的最小值
 */
public class MyStack {

    private Stack<Integer> dataStack = new Stack<Integer>();/*数据栈*/
    private Stack<Integer> minStack = new Stack<Integer>();/*最小值栈*/

    private static final Logger logger = LoggerFactory.getLogger(MyStack.class);

    /**
     * 添加value
     * @param value
     */
    public void putData(Integer value){
        /**
         * 这段代码的问题在于：先存大数，然后再存小数，然后逐个pop，到小数pop完之后，会没有最小值
         * 这明显是不合理的

        boolean minstackAddFlage=true;
        if(!dataStack.isEmpty()&&minStack.peek().compareTo(value)<0){
            minstackAddFlage = false;
        }else if(!minStack.isEmpty()&&minStack.peek().compareTo(value)>0){
            minStack.pop();
        }
        //最终添加
        if (minstackAddFlage) {
            //保持最小值
            minStack.add(value);
        }
         */
        //example demonstrate are here：
        if (dataStack.isEmpty()||getMin()>=value) {
            minStack.add(value);
        }
        //加入数据栈
        dataStack.add(value);
    }



    public void popData(){
        if (dataStack.isEmpty()) {
            logger.error("数据栈为空");
            return ;
        }
        Integer value = dataStack.pop();
        if (value.equals(getMin())) {
            minStack.pop();
        }


    }

    /**
     * 获取最小值的操作
     */
    public Integer getMin(){
        if (minStack.isEmpty()) {
            throw new StackIsEmptyException("数据栈为空");
        }
        logger.info("the minest is:",minStack.peek());
        return minStack.peek();
    }

    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//        myStack.putData(1);
//        myStack.putData(4);
//        myStack.putData(35);
//        logger.info("the minest is:",myStack.getMin());

        Arrays.asList(1, 2, 3, 4).stream().forEach((e) -> {System.out.println(e);});

    }


    class StackIsEmptyException extends RuntimeException{
        public StackIsEmptyException(){
            super();
        }
        public StackIsEmptyException(String message){
            super(message);
        }

    }



}
