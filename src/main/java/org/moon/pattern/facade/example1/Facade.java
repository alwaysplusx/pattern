package org.moon.pattern.facade.example1;

import org.moon.pattern.facade.example1.subsystem.SystemA;
import org.moon.pattern.facade.example1.subsystem.SystemB;
import org.moon.pattern.facade.example1.subsystem.SystemC;

public class Facade {
	
	private static SystemA systemA;
	private static SystemB systemB;
	private static SystemC systemC;
	
	public static void execute(){
		systemA.execute();
		systemB.execute();
		systemC.execute();
	}
	
}
