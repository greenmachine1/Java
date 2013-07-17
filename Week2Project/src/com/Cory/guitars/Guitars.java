package com.Cory.guitars;


// model, type, price
public enum Guitars {
	Jackson("Randy Rhodes", "Left Handed", 699.95),
	Fender("Stratocaster", "Right Handed", 1299.95),
	Gibson("Explorer", "Left Handed", 899.95),
	Ibanez("S Series", "Left Handed", 799.95);
	
	private final String model;
	private final String type;
	private final float price;
	
	
	private Guitars(String model, String type, float price){
		this.model = model;
		this.type = type;
		this.price = price;
	}
	
	public String setModel(){
		return model;
	}
	
	public String setType(){
		return type;
	}
	
	public float setPrice(){
		return price;
	}
}
