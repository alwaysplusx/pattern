package org.moon.pattern.flyweight.example1;

public abstract class Chessman {

	public abstract String getColor();

	public void display(Coordinates coordinates) {
		System.out.println(getColor() + ", x = " + coordinates.getX() + ", y = " + coordinates.getY());
	}

}
