package org.moon.pattern.factory.abstractfactory.impl.spring;

import org.moon.pattern.factory.abstractfactory.Button;
import org.moon.pattern.factory.abstractfactory.ComponentFactory;
import org.moon.pattern.factory.abstractfactory.Frame;
import org.moon.pattern.factory.abstractfactory.TextArea;

public class SpringComponentFactoryImpl implements ComponentFactory {

	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public Frame createFrame() {
		return new SpringFrame();
	}

	@Override
	public TextArea createTextArea() {
		return new SpringTextArea();
	}

}
