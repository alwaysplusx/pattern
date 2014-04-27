package org.moon.pattern.cof.example1;

import org.moon.pattern.cof.example1.impl.FirstHandler;
import org.moon.pattern.cof.example1.impl.SecondHandler;
import org.moon.pattern.cof.example1.impl.ThirdHandler;

public class Client {

	public static void main(String[] args) {
		Purchase purchase = new Purchase("采购单", 90);
		
		PurchaseHandler handler1 = new FirstHandler("first");
		PurchaseHandler handler2 = new SecondHandler("second");
		PurchaseHandler handler3 = new ThirdHandler("thrid");
		
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		handler1.handler(purchase);
		
	}
	
}
