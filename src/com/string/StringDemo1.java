package com.string;

public class StringDemo1 {

	// java.lang.String
	// mutablity <--> immuable
	// String constant pool

	public static void main(String[] args) {

		String s = "hello all good noon";
		String s2 = "java";
		// String s1 = new String("node");
		// System.out.println(s);
		// System.out.println(s1);

		// String s1= s.concat(" royal");
		String s3 = s.toLowerCase();
		s3 = s.toUpperCase();
		System.out.println(s3.isEmpty());
		System.out.println("contains  " + s3.contains("j"));
		boolean flag = s3.contains("j");
		System.out.println(flag);
		if (flag) {
			System.out.println("contains...");
		} else {
			System.out.println("not");
		}

		char c = s3.charAt(0);
		System.out.println("char at-->" + c);

		System.out.println(s3.compareTo("Ab"));
		System.out.println("equals..." + s3.equals("Ab"));

		System.out.println("ends with..." + s3.endsWith("AB"));
		System.out.println("starts with.." + s3.startsWith("A"));
		System.out.println(s3.equalsIgnoreCase("ab"));
		char c1[] = s3.toCharArray();
		System.out.println(c1[0]);
		String sp[] = s3.split(",");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		System.out.println(s3);

	}
}
