package org.moon.pattern.factory.simplefactory.impl;

import org.moon.pattern.factory.simplefactory.Phone;

public class OtherPhone implements Phone {

	private String type = "other";
	
	@Override
	public String getType() {
		return type;
	}

	@Override
	public String call() {
		return null;
	}

}
