package com.webank.lian.domain;

public class User {
	
	private Long id;
	private String name;
	private String password;
	private String identification;
	private String phone;
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append(", identification='").append(identification).append('\'');
		sb.append(", phone='").append(phone).append('\'');
		sb.append('}');
		return sb.toString();
	}
	
	public User(Long id, String name, String password, String identification, String phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.identification = identification;
		this.phone = phone;
	}
	
	public User() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getIdentification() {
		return identification;
	}
	
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
