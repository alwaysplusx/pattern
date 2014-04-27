package org.moon.pattern.singleton;

public class Singleton {

	private volatile static Singleton me;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (me == null) {
			synchronized (Singleton.class) {
				/* 双重检验，确保创建对象只有一个 */
				if (me == null) {
					me = new Singleton();
				}
			}
		}
		return me;
	}

}
