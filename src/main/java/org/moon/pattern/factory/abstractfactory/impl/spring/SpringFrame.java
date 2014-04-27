package org.moon.pattern.factory.abstractfactory.impl.spring;

import org.moon.pattern.factory.abstractfactory.Frame;

public class SpringFrame implements Frame{

	@Override
	public void show() {
		System.out.println("spring frame show");
	}

}
