package org.moon.pattern.proxy.example1;

public class Proxy implements Subject {

	private RealSubject realSubject = new RealSubject();

	public void request() {
		preRequest();
		realSubject.realRequest();
		postRequest();
	}

	private void postRequest() {
		System.out.println("请求后处理");
	}

	private void preRequest() {
		System.out.println("请求前处理");
	}

}
