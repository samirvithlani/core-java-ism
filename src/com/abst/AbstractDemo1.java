package com.abst;

/*
 *  //abstract class RANGE 0 to 100
 *  //interface ...
 * 
 * */

abstract class TRAI {

	public abstract void call();

	public void mms() {

		System.out.println("mms");
	}

}

public class AbstractDemo1 extends TRAI {

	public static void main(String[] args) {

		// TRAI t = new TRAI();
		// polymorphic object...
		// AbstractDemo1 a = new AbstractDemo1();
		// parent class reference and child class memory
		TRAI t = new AbstractDemo1();
		t.mms();
		t.call();
	}

	public void mms() {
		// TODO Auto-generated method stub
		super.mms();
		System.out.println("mms1");
	}

	public void call() {

		System.out.println("call method called...");

	}
}
