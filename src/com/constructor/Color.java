package com.constructor;

/*
 * def:const is a special function which has same name as class name
 * const does not have return type
 * const can have param
 * 
 * type:
 * 1)default const
 * 2)param const
 * 
 * use:
 * 
 * to intialize instance varibale class...
 * 
 * 
 * */
public class Color {

	int colorcode;

	public Color() {

		colorcode = 0;
		System.out.println("defult / 0 param ");
	}

	public Color(String s) {

	}

	public Color(int cc) {

		colorcode = cc;
	}

	public static void main(String[] args) {

//		Color c1 = new Color();
		// Color c2 = new Color();

		Color c1 = new Color(140);
		Color c2 = new Color(25);
		Color c3 = new Color();
		Color c4= new Color("raj");
		c1.colorcode = 250;

		System.out.println(c1.colorcode);
		System.out.println(c2.colorcode);

		System.out.println(c1);
		System.out.println(c2);

	}
}
