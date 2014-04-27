package org.moon.pattern.command.example1;


/**
 * 调用者
 * @author wuxin
 * <p>Feb 8, 2014 11:24:18 PM</p>
 */
public class Invoker {

	private Command command;

	public Invoker(Command command){
		this.command = command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void call(){
		command.execute();
	}

}
