package org.moon.pattern.cof.example1.impl;

import org.moon.pattern.cof.example1.Purchase;
import org.moon.pattern.cof.example1.PurchaseHandler;

/**
 * >200
 * @author wuxin
 * <p>Jan 29, 2014 3:30:16 PM</p>
 */
public class ThirdHandler extends PurchaseHandler {

	public ThirdHandler(String name) {
		super(name);
	}

	@Override
	public void handler(Purchase purchase) {
		System.out.println("最大boss处理,金额为" + purchase.getAmount());
	}

}
