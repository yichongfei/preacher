package com.preacher.forum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="PreacherAccount")
public class PreacherAccount {
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator") 
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name="ID" ,length=50)
	private	String id;
	@Column(name="ACCOUNT" ,length=50)
	private String account;
	@Column(name="PASSWORD" ,length=50)
	private String passWord;
	@Column(name="PHONENUMBER" ,length=50)
	private String phoneNumber;
	@Column(name="EMAIL" ,length=50)
	private String email;
	@Column(name="MESSAGE" ,length=500)
	private String message;
	@Column(name="COUNTRY" ,length=50)
	private String country;
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPhoneNbumer() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "PreacherAccount [id=" + id + ", account=" + account + ", passWord=" + passWord + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", message=" + message + ", country=" + country + "]";
	}
	
	
}
