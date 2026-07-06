package com.coforge.day4.abstraction;

public abstract class Figure implements AreaPlan {
	private int len;
	private int bre;
	private int side;
	private long bas;
	private long hei;


	public Figure(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}


	public Figure(int side) {
		this.side = side;
	}


	public Figure(long bas, long hei) {
		this.bas = bas;
		this.hei = hei;
	}
	
	public abstract void area(); // abstract method
	
	
	
	
	public int getLen() {
		return len;
	}



	public int getBre() {
		return bre;
	}



	public int getSide() {
		return side;
	}



	public long getBas() {
		return bas;
	}

	public long getHei() {
		return hei;
	}
	
}
