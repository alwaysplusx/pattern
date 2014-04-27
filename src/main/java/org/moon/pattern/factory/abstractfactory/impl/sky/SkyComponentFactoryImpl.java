package org.moon.pattern.factory.abstractfactory.impl.sky;

import org.moon.pattern.factory.abstractfactory.Button;
import org.moon.pattern.factory.abstractfactory.ComponentFactory;
import org.moon.pattern.factory.abstractfactory.Frame;
import org.moon.pattern.factory.abstractfactory.TextArea;

public class SkyComponentFactoryImpl implements ComponentFactory {

	@Override
	public Button createButton() {
		return new SkyButton();
	}

	@Override
	public Frame createFrame() {
		return new SkyFrame();
	}

	@Override
	public TextArea createTextArea() {
		return new SkyTextArea();
	}

}
