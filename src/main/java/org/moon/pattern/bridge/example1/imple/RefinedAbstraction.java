package org.moon.pattern.bridge.example1.imple;

import org.moon.pattern.bridge.example1.Abstraction;

/**
 * 毛笔型号的扩展
 * @author wuxin
 * <p>Jan 25, 2014 6:10:37 PM</p>
 */
public class RefinedAbstraction extends Abstraction {

	@Override
	public void doSomething() {
		this.implementor.operation();
	}

}
