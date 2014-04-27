package org.moon.pattern.command.example1;

import org.moon.pattern.command.example1.impl.ConcreteCommand;

public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker(new ConcreteCommand());
		invoker.call();
	}
	
}
