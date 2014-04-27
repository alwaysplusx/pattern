package org.moon.pattern.composite.example1.impl;

import org.moon.pattern.composite.example1.Component;

public class ImageFile extends Component{

	@Override
	public void add(Component component) {
		throw new RuntimeException();
	}

	@Override
	public void remove(Component component) {
		throw new RuntimeException();
	}

	@Override
	public Component getChild(int index) {
		throw new RuntimeException();
	}

	@Override
	public void killVirus() {
		
	}

}
