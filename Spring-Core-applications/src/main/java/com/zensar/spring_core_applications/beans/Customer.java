package com.zensar.spring_core_applications.beans;

public class Customer {

	private String name;
	private int Id;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", Id=" + Id + ", address=" + address + "]";
	}

	public Customer(String name, int id, Address address) {
		super();
		System.out.println("parameterized constructor ");
		this.name = name;
		Id = id;
		this.address = address;
	}

	public Customer() {
		super();
		System.out.println("default constructor ");
	}

	public void myMethod() {
		System.out.println("myMethod ");
	}

	public void destroyMethod() {
		System.out.println("destroyMethod ");
	}

	public Customer(Address address) {
		super();
		this.address = address;
	}

}
