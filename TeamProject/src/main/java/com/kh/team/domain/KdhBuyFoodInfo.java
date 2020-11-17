package com.kh.team.domain;

public class KdhBuyFoodInfo {

	private int food_buy_count;
	private int food_buy_price;
	private int food_num;
	private String food_code;
	private String food_name;
	private int food_price;
	private int food_count;
	private String food_image;
	public KdhBuyFoodInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KdhBuyFoodInfo(int food_buy_count, int food_buy_price, int food_num, String food_code, String food_name,
			int food_price, int food_count, String food_image) {
		super();
		this.food_buy_count = food_buy_count;
		this.food_buy_price = food_buy_price;
		this.food_num = food_num;
		this.food_code = food_code;
		this.food_name = food_name;
		this.food_price = food_price;
		this.food_count = food_count;
		this.food_image = food_image;
	}
	public int getFood_buy_count() {
		return food_buy_count;
	}
	public void setFood_buy_count(int food_buy_count) {
		this.food_buy_count = food_buy_count;
	}
	public int getFood_buy_price() {
		return food_buy_price;
	}
	public void setFood_buy_price(int food_buy_price) {
		this.food_buy_price = food_buy_price;
	}
	public int getFood_num() {
		return food_num;
	}
	public void setFood_num(int food_num) {
		this.food_num = food_num;
	}
	public String getFood_code() {
		return food_code;
	}
	public void setFood_code(String food_code) {
		this.food_code = food_code;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public int getFood_price() {
		return food_price;
	}
	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}
	public int getFood_count() {
		return food_count;
	}
	public void setFood_count(int food_count) {
		this.food_count = food_count;
	}
	public String getFood_image() {
		return food_image;
	}
	public void setFood_image(String food_image) {
		this.food_image = food_image;
	}
	@Override
	public String toString() {
		return "KdhBuyFoodInfo [food_buy_count=" + food_buy_count + ", food_buy_price=" + food_buy_price + ", food_num="
				+ food_num + ", food_code=" + food_code + ", food_name=" + food_name + ", food_price=" + food_price
				+ ", food_count=" + food_count + ", food_image=" + food_image + "]";
	}
	
	
}
