package org.moon.pattern.composite.example1;

public abstract class Component {

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract Component getChild(int index);
	
	public abstract void killVirus();
	
}
