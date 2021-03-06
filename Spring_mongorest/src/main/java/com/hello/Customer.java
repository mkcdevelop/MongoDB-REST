package com.hello;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class Customer implements Serializable {

	@Id
	String id;
	
	String firstName;
	String lastName;
	
	public Customer(){}
	
	public Customer(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
	
}

