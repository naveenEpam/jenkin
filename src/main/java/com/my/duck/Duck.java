package com.my.duck;

public abstract class Duck{
	
	FlyBehaviour flBehaviour;
	QuackBehaviour quackBehaviour;
	
	public abstract void display() ;
	public void swim() {
		System.out.println("Duck is swimming");
	}
	
	public void performQuck() {
		quackBehaviour.quack();
	}
	
	public void performFly() {
		flBehaviour.fly();
	}
}