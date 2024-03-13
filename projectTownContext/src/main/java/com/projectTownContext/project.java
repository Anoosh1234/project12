package com.projectTownContext;

public class project {
	private String name;
	private String email;
	public project(String name, String email, String maths, String english) {
		super();
		this.name = name;
		this.email = email;
		this.maths = maths;
		this.english = english;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	private String maths;
	private String english;


}
