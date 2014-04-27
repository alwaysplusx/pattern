package org.moon.pattern.factory.abstractfactory.impl.spring;

import org.moon.pattern.factory.abstractfactory.Button;

public class SpringButton implements Button{

	@Override
	public void click() {
		System.out.println("spring button click");
	}

}
