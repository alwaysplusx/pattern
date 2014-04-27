package org.moon.pattern.flyweight.example1;

/**
 * 外部状态,随系统改变不可以共享
 * @author wuxin
 * <p>Jan 26, 2014 4:31:32 PM
 */
public class Coordinates {
	
	private int x;
	private int y;

	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
}