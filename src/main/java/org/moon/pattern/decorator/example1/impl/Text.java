package org.moon.pattern.decorator.example1.impl;

import org.moon.pattern.decorator.example1.Component;

/**
 * 具体被装饰类
 * @author wuxin
 * <p>Jan 26, 2014 2:21:23 PM
 */
public class Text extends Component {

	@Override
	public void show() {
		System.out.println("text component show!");
	}

}
