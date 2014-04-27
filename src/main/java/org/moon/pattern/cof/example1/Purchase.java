package org.moon.pattern.cof.example1;

/**
 * 订单类
 * @author wuxin
 * <p>Jan 29, 2014 2:58:39 PM</p>
 */
public class Purchase {
	
	private String poNo;
	private int amount;
	private String purpose;

	public Purchase(String poNo, int amount) {
		this.poNo = poNo;
		this.amount = amount;
	}
	
	public String getPoNo() {
		return poNo;
	}

	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
