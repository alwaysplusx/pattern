package org.moon.pattern.cof.example1.impl;

import org.moon.pattern.cof.example1.Purchase;
import org.moon.pattern.cof.example1.PurchaseHandler;

/**
 * <200
 * @author wuxin
 * <p>Jan 29, 2014 3:30:09 PM</p>
 */
public class SecondHandler extends PurchaseHandler {

	public SecondHandler(String name) {
		super(name);
	}

	@Override
	public void handler(Purchase purchase) {
		if (purchase.getAmount() < 200) {
			System.out.println("第二处理人处理成功,金额<200");
		} else {
			successor.handler(purchase);
		}
	}

}
