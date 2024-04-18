package com.javaex.vo;

public class PayendVo1 {

	private String name;
	private String hp;
	private String address;
	private int total;
	
	public PayendVo1() {
		super();
	}

	public PayendVo1(String name, String hp, String address, int total) {
		super();
		this.name = name;
		this.hp = hp;
		this.address = address;
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PayendVo1 [name=" + name + ", hp=" + hp + ", address=" + address + ", total=" + total + "]";
	}
	
	
	
}
