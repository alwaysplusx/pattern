package org.moon.pattern.proxy.example1;

public class Client {

	public static void main(String[] args) {
		Subject subject = new Proxy();
		subject.request();
	}
	
}
