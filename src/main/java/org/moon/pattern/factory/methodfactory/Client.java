package org.moon.pattern.factory.methodfactory;

import org.moon.pattern.factory.methodfactory.impl.DBLoggerFactoryImpl;

public class Client {

	public static void main(String[] args) {
		LoggerFactory factory = new DBLoggerFactoryImpl();
		Logger logger = factory.createLogger();
		logger.info("hello world!");
	}
	
}
