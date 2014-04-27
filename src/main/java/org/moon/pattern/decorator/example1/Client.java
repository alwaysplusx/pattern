package org.moon.pattern.decorator.example1;

import org.moon.pattern.decorator.example1.impl.ContentDecorator;
import org.moon.pattern.decorator.example1.impl.Window;
import org.moon.pattern.decorator.example1.impl.TitleDecorator;

public class Client {

	public static void main(String[] args) {
		//为内容提供装饰
		Component component = new TitleDecorator(new Window());
		//为标题提供装饰
		component = new ContentDecorator(component);
		component.show();
	}
	
}
