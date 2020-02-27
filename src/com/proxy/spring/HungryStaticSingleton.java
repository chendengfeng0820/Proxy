package com.proxy.spring;

/**
 * @author: cdf
 * @create: 2020-02-27 16:30
 **/

/**
 * 饿汉式单例模式
 * 静态代码块
 */
public class HungryStaticSingleton {

	private static final HungryStaticSingleton hungrystaticsingleton;

	private HungryStaticSingleton(){};

	static {
		hungrystaticsingleton=new HungryStaticSingleton();
	}

	private static HungryStaticSingleton getInstance(){
		return hungrystaticsingleton;
	}
}
