package com.app.core;

import java.time.LocalDate;

public class StyleWithPen {

	private static int idCounter = 1;
	private int id;
	private Brand brand;
	private String color;
	private String inkColor;
	private Material material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private double price;
	private double discount;

	public StyleWithPen(Brand brand, String color, String inkColor, Material material, int stock,
			LocalDate stockListingDate, double price) {
		this.id = idCounter++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = LocalDate.now();
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = discount;
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public Brand getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public Material getMaterial() {
		return material;
	}

	public int getStock() {
		return stock;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	public int getId() {
		return id;
	}

	public void updateStock(int newStock) {
		stock = newStock + stock;
		stockUpdateDate = LocalDate.now();
	}

	public static void setIdCounter(int idCounter) {
		StyleWithPen.idCounter = idCounter;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDiscount(double newDiscount) {
		discount = newDiscount;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	@Override
	public String toString() {
		return "Pen ID: " + id + "\nBrand: " + brand + "\nColor: " + color + "\nInkColor: " + inkColor + "\nMaterial: "
				+ material + "\nStock: " + stock + "\nStock Update Date: " + stockUpdateDate + "\nStock Listing Date: "
				+ stockListingDate + "\nPrice per pen: " + price + " INR" + "\nDiscount: " + discount + "%";
	}

}
