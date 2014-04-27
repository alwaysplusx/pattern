package org.moon.pattern.cof.example1.impl;

import org.moon.pattern.cof.example1.Purchase;
import org.moon.pattern.cof.example1.PurchaseHandler;

/**
 * 金额小于100能处理订单
 * @author wuxin
 * <p>Jan 29, 2014 3:29:37 PM</p>
 */
public class FirstHandler extends PurchaseHandler {

	public FirstHandler(String name) {
		super(name);
	}

	@Override
	public void handler(Purchase purchase) {
		if (purchase.getAmount() < 100) {
			System.out.println("第一处理人处理成功,金额<100元");
		} else {
			successor.handler(purchase);
		}
	}

}
