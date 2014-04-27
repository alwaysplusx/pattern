package org.moon.pattern.flyweight.example1.impl;

import org.moon.pattern.flyweight.example1.Chessman;

/**
 * 内部状态是存储在享元对象内部并且不会随环境改变而改变的状态，内部状态可以共享
 * 黑色棋子,在系统中不会改变,可以被共享
 * @author wuxin
 * <p>Jan 26, 2014 4:30:30 PM
 */
public class BlockChessman extends Chessman{

	@Override
	public String getColor() {
		return "block";
	}

}
