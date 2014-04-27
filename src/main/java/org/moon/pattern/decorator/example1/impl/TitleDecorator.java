package org.moon.pattern.decorator.example1.impl;

import org.moon.pattern.decorator.example1.Component;
import org.moon.pattern.decorator.example1.Decorator;

/**
 * 标签装饰类
 * @author wuxin
 * <p>Jan 26, 2014 2:21:39 PM
 */
public class TitleDecorator extends Decorator{

	public TitleDecorator(Component component) {
		super(component);
	}
	
	@Override
	public void show() {
		super.show();
		addTitle();
	}
	
	protected void addTitle(){
		System.out.println("给组件添加标题");
	}
	
	

}
