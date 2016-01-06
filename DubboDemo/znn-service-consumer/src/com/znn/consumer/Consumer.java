package com.znn.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.znn.provider.DemoService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:D:/develop/myeclipsework/znn-service-consumer/WebRoot/WEB-INF/dubbo-consumer.xml");
		context.start();
		DemoService demoService = (DemoService)context.getBean("demoService"); // ��ȡԶ�̷������
	    String hello = demoService.sayHello("world"); // ִ��Զ�̷���
	    System.out.println(hello);
	}
}
