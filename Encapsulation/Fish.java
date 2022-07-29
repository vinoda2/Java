package com.xworkz.Encapsulation;

public class Fish {

	private int id;
	private String fishtype;
	private String place;
	
	public Fish(int id, String fishtype,String place){
	
		this.id=id;
		this.fishtype=fishtype;
		this.place=place;
	}
	
	public void setID(int ID) {
		id=ID;
	}
	
	public void setfishtype(String fish) {
		fishtype=fish;
	}
	
	public void setplace(String orderplace) {
		place=orderplace;
	}
	
	public int getID() {
		return id;
	}
	
	public String getfishtype() {
		return fishtype;
	}
	String getplace() {
		return place;
	}

}



}


