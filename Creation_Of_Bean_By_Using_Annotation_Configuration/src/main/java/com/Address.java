package com;

import org.springframework.stereotype.Component;

@Component("addr")
public class Address {
	
	public Address() {
		System.out.println("Address object created");
	}
}
