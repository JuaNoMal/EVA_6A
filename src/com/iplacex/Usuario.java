package com.iplacex;

public class Usuario {
	private int Rut;
	private String UserName;
	private String Password;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int rut, String userName, String password) {
		super();
		Rut = rut;
		UserName = userName;
		Password = password;
	}

	public int getRut() {
		return Rut;
	}

	public void setRut(int rut) {
		Rut = rut;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Usuario [Rut=" + Rut + ", UserName=" + UserName + ", Password=" + Password + "]";
	}
	
	

}
