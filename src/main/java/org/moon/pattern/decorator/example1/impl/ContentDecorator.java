package org.moon.pattern.decorator.example1.impl;

import org.moon.pattern.decorator.example1.Component;
import org.moon.pattern.decorator.example1.Decorator;

/**
 * 内容装饰类
 * @author wuxin
 * <p>Jan 26, 2014 2:21:45 PM
 */
public class ContentDecorator extends Decorator{

	public ContentDecorator(Component component) {
		super(component);
	}

	@Override
	public void show() {
		super.show();
		warpContent();
	}
	
	protected void warpContent(){
		System.out.println("包裹组件内容");
	}
	
}
