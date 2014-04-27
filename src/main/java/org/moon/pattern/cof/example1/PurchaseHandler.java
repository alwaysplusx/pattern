package org.moon.pattern.cof.example1;

/**
 * 抽象订单处理者
 * @author wuxin
 * <p>Jan 29, 2014 3:29:26 PM</p>
 */
public abstract class PurchaseHandler {

	private String name;
	/**
	 * 如果当前处理者不满足处理该订单条件时候由继任者处理
	 */
	protected PurchaseHandler successor;

	public PurchaseHandler(String name) {
		this.name = name;
	}

	public abstract void handler(Purchase purchase);

	public PurchaseHandler getSuccessor() {
		return successor;
	}

	public String getName() {
		return name;
	}

	public void setSuccessor(PurchaseHandler successor) {
		this.successor = successor;
	}

}
