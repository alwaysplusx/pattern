package org.moon.pattern.bridge.example1.imple;

import org.moon.pattern.bridge.example1.Implementor;

public class ReadImplementor implements Implementor {

	@Override
	public void operation() {
		System.out.println("read operation");
	}

}
