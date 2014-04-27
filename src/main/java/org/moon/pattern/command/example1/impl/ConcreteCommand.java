package org.moon.pattern.command.example1.impl;

import org.moon.pattern.command.example1.Command;
import org.moon.pattern.command.example1.Receiver;

/**
 * 具体命令
 * @author wuxin
 * <p>Feb 8, 2014 11:25:16 PM</p>
 */
public class ConcreteCommand implements Command {

	private Receiver receiver = new Receiver();
	
	@Override
	public void execute() {
		receiver.action();
	}

}
