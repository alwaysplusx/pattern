package org.moon.pattern.bridge.example1;

import org.moon.pattern.bridge.example1.imple.ReadImplementor;
import org.moon.pattern.bridge.example1.imple.RefinedAbstraction;


public class Client {

	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.setImplementor(new ReadImplementor());
		abstraction.doSomething();
	}
	
}
