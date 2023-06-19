package DTO;

public class Student {
private String Name;
private String userId;
private String email;
private String phone;
private String pass;
private String address;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}


public Student(String name, String userId, String email, String phone, String pass, String address) {
	super();
	Name = name;
	this.userId = userId;
	this.email = email;
	this.phone = phone;
	this.pass = pass;
	this.address = address;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public String getUserId() {
	return userId;
}


public void setUserId(String userId) {
	this.userId = userId;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}


public String getPass() {
	return pass;
}


public void setPass(String pass) {
	this.pass = pass;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}

}
