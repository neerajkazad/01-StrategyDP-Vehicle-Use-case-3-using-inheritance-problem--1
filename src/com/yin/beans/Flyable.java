package com.yin.beans;

public class Flyable extends Vehicle {
	@Override
	public void honk() {
		//logic for honk
		System.out.println("flyable honk");
	}

	public void fly() {
		// logic for fly
		System.out.println("fly");
	}
}
