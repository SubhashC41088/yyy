package com.Zibra.Zibra.Entity;

import lombok.Data;

@Data
public class User {
	
	
	private long id;
	private String FisrtName;
	private  String LastName;
	private String email;
	private int age;
	public Object getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
