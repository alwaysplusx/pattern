package org.moon.pattern.decorator.example1;

/**
 * 抽象装饰类,提供一个注入
 * @author wuxin
 * <p>Jan 26, 2014 2:20:27 PM
 */
public abstract class Decorator extends Component {

	protected Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void show() {
		this.component.show();
	}

}
