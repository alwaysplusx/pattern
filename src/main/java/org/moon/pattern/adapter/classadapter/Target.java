package org.moon.pattern.adapter.classadapter;

public interface Target {

	public Object find(Class<?> clazz,int index);
	public Object otherMethod();
}
