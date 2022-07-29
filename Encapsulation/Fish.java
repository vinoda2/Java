package com.xworkz.Encapsulation;

public class Fish {

	private int id;
	private String fishtype;
	private String place;
	
	public Fish(){
	
	}
	
	public void setID(int id) {
		this.id=id;
	}
	
	public void setfishtype(String fishtype) {
		this.fishtype=fishtype;
	}
	
	public void setplace(String place) {
		this.place=place;
	}
	
	public int getID(int id) {
		return id;
	}
	
	public String getfishtype(String fishtype) {
		return fishtype;
	}
	String getplace(String place) {
		return place;
	}

}


