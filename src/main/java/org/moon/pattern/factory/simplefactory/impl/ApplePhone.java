package org.moon.pattern.factory.simplefactory.impl;

import org.moon.pattern.factory.simplefactory.Phone;

public class ApplePhone implements Phone {

	private String type = "apple";
	
	@Override
	public String getType() {
		return type;
	}

	@Override
	public String call() {
		return null;
	}

}
