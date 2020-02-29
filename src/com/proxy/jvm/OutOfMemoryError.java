package com.proxy.jvm;

import java.util.ArrayList;

/**
 * @author: cdf
 * @create: 2020-02-29 15:48
 **/
public class OutOfMemoryError {

    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<Object>();
        while (true){
            int[] a=new int[2000000000];
            list.add(a);
        }
    }
}
