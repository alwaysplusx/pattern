package org.moon.pattern.decorator.example1.impl;

import org.moon.pattern.decorator.example1.Component;

/**
 * 具体的被装饰类
 * @author wuxin
 * <p>Jan 26, 2014 2:21:12 PM
 */
public class Window extends Component{

	@Override
	public void show() {
		System.out.println("window component show!");
	}

}
