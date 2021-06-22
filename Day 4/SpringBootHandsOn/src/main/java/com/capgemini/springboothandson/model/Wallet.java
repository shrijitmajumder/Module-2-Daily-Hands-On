package com.capgemini.springboothandson.model;

public class Wallet {
	
	private int wallid;
	private String waltype;
	private double balance;
	
	public Wallet() {
		super();
	}

	public Wallet(int wallid, String waltype, double balance) {
		super();
		this.wallid = wallid;
		this.waltype = waltype;
		this.balance = balance;
	}

	public int getWallid() {
		return wallid;
	}

	public void setWallid(int wallid) {
		this.wallid = wallid;
	}

	public String getWaltype() {
		return waltype;
	}

	public void setWaltype(String waltype) {
		this.waltype = waltype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
