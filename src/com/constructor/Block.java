package com.constructor;

public class Block {

	// block instance block,static block
	{
		System.out.println("instanc block 1");
	}

	{
		System.out.println("instance block 2");
	}
	static {
		System.out.println("static bloclk..");
	}

	public Block() {

		System.out.println("default const called...");
	}

	public static void main(String[] args) {

		System.out.println("main called...");
		Block b1 = new Block();
		Block b2 = new Block();

	}
}
