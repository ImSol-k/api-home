package com.javaex.vo;

public class Jw_Vo {

	// 유저
	private int userNo;
	private String id;
	private String password;
	private String name;
	private String nickName;
	private String hp;
	private String email;
	private String address;
	private int manager;

	public Jw_Vo() {

	}
	
	public Jw_Vo(String id, String password) {

		this.id = id;
		this.password = password;
	}

	public Jw_Vo(int userNo, String id, String password, String name, String nickName, String hp, String email,
			String address, int manager) {

		this.userNo = userNo;
		this.id = id;
		this.password = password;
		this.name = name;
		this.nickName = nickName;
		this.hp = hp;
		this.email = email;
		this.address = address;
		this.manager = manager;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Jw_Vo [userNo=" + userNo + ", id=" + id + ", password=" + password + ", name=" + name + ", nickName="
				+ nickName + ", hp=" + hp + ", email=" + email + ", address=" + address + ", manager=" + manager + "]";
	}

}