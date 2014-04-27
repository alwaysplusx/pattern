package org.moon.pattern.bridge.example1;

/**
 * 相当于毛笔的角色
 * @author wuxin
 * <p>Jan 25, 2014 6:04:07 PM</p>
 */
public abstract class Abstraction {

	/**
	 * 便于子类访问,相当于颜色的抽象
	 */
	protected Implementor implementor;
	
	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public abstract void doSomething();
	
}
