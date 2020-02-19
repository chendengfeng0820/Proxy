package com.proxy.Test;

/**
 * @author: cdf
 * @create: 2020-02-19 22:56
 **/
public class Producer implements IProducer {
	@Override
	public void saleproducer(float money) {
		System.out.println("卖出产品，拿到钱："+money);
	}

	@Override
	public void afterservice(float money) {
		System.out.println("产品售后，拿到钱："+money);
	}
}
