package com.proxy.jvm;

/**
 * @author: cdf
 * @create: 2020-02-29 15:41
 **/
public class StackOverFlowError {

    public static void main(String[] args) {
        method();
    }

    public static void method(){
         method();
    }
}
