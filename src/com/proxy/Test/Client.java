package com.proxy.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: cdf
 * @create: 2020-02-19 23:00
 * 动态代理
 **/
public class Client {
	public static void main(String[] args) {
		Producer producer=new Producer();

		IProducer iProducer= (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
				producer.getClass().getInterfaces(), new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						Object result =null;
						Float money= (Float) args[0];
						if("saleproducer".equals(method.getName())){
							result=method.invoke(producer,money*0.8f);
						}
						return result;
					}
				});
		iProducer.saleproducer(1000);
	}

}
