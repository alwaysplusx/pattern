package org.moon.pattern.factory.abstractfactory;

public interface ComponentFactory {

	public Button createButton();
	public Frame createFrame();
	public TextArea createTextArea();
	
}
