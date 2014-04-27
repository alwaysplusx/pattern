package org.moon.pattern.singleton;

public class TaskManager {

	/* 饿汉式，优点不用考虑线程问题 */
	private static TaskManager me = new TaskManager();

	private TaskManager() {
	}

	public static TaskManager getInstance() {
		return me;
	}

}
