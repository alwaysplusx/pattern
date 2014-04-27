package org.moon.pattern.adapter.classadapter;

public class Adapter extends Adaptee implements Target{

	@Override
	public Object find(Class<?> clazz, int index) {
		return getObjectfromDB(clazz, index);
	}

	@Override
	public Object otherMethod() {
		return null;
	}

}
