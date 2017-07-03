package com.yin.beans;

public class Drivable extends Vehicle{
	public void drive() {
		//logic for drive
		System.out.println("driving");
	}

	@Override
	public void honk() {
		//logic for honk
		System.out.println("honk");
		
	}
}
