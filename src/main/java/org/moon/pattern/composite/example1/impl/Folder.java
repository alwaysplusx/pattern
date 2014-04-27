package org.moon.pattern.composite.example1.impl;

import java.util.ArrayList;
import java.util.List;

import org.moon.pattern.composite.example1.Component;

public class Folder extends Component{

	List<Component> childElements = new ArrayList<Component>();
	
	@Override
	public void add(Component component) {
		
	}

	@Override
	public void remove(Component component) {
		
	}

	@Override
	public Component getChild(int index) {
		return null;
	}

	@Override
	public void killVirus() {
		
	}

}
