package com.constructor;

class Range {

	public Range(int x) {
		System.out.println("range class param const called..");
	}

	public Range() {
		System.out.println("-----");
	}
}

public class Area extends Range {

	public Area() {

		// System.out.println("");
		super(150);
		System.out.println("area class default const called...");
	}

	public static void main(String[] args) {

		Area a = new Area();

	}
}
