package org.moon.pattern.adapter.classadapter;

public class Client {

	public static void main(String[] args) {
		Target dao = new Adapter();
		dao.find(Object.class, 1);
	}
	
}
