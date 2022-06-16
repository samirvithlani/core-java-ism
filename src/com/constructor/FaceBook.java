package com.constructor;

public class FaceBook {

	 int uId = 10;
	
	public FaceBook(int id) {
		
		uId = id;
	}

	public static void main(String[] args) {

		
		FaceBook f = new FaceBook(101);
		FaceBook f2 = new FaceBook(102);
		System.out.println(f.uId);
		System.out.println(f2.uId);
		
	}
	
	
	
}
