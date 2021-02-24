package com.corenttech.engine;

public class Doller {

	private int amount;

	public Doller(int amount) {
		this.amount = amount;
	}

	public void times(int times) {
		this.amount *= times;
	}
	
	public int getAmount() {
		return this.amount;
	}

}
