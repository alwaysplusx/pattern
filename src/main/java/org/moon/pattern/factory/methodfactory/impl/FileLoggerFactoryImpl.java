package org.moon.pattern.factory.methodfactory.impl;

import org.moon.pattern.factory.methodfactory.Logger;
import org.moon.pattern.factory.methodfactory.LoggerFactory;

public class FileLoggerFactoryImpl implements LoggerFactory {

	@Override
	public Logger createLogger() {
		return new FileLoggerImpl();
	}

}
