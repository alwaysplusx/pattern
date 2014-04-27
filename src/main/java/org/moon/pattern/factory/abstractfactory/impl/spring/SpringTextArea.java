package org.moon.pattern.factory.abstractfactory.impl.spring;

import org.moon.pattern.factory.abstractfactory.TextArea;

public class SpringTextArea implements TextArea{

	@Override
	public void text() {
		System.out.println("spring textarea text");
	}

}
