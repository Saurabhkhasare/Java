package com.app.core;

public enum Brand {

	CELLO(10), REYNOLDS(60), TRIMAX(50);

	private int price;

	Brand(int price) {

		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
