package org.moon.pattern.factory.simplefactory.impl;

import org.moon.pattern.factory.simplefactory.Phone;

public class SamSungPhone implements Phone {

	private String type = "samsung";
	
	@Override
	public String getType() {
		return type;
	}

	@Override
	public String call() {
		return null;
	}

}
