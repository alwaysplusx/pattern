package org.moon.pattern.singleton;

//Initialization on Demand Holder 
public class PerfectSingleton {

	private PerfectSingleton(){}
	
	/*内部类，使用时加载*/
	private static class InstanceHolder {
		private static PerfectSingleton instance = new PerfectSingleton();
	}

	/**
	 * 由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。
	 */
	public static PerfectSingleton getInstance() {
		return InstanceHolder.instance;
	}

}
