package com.cms.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int id;

	@Column(name = "customer_name", length = 50, nullable = false)
	private String name;

	@Column(name = "customer_email", length = 60, unique = true)
	private String email;

	@Column(name = "customer_mobile", length = 10, nullable = false)
	private String mobile;

	@Column(name = "customer_password", length = 20, nullable = false)
	private String password;

	public Customer() {
	}

	public Customer(String name, String email, String mobile, String password) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}