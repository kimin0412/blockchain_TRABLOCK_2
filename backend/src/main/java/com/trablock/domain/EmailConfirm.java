package com.trablock.domain;

public class EmailConfirm {
	private String email;
	private String code;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "EmailConfirm [email=" + email + ", code=" + code + "]";
	}
	
	
}