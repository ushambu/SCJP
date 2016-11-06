package com.day_2.VarArg;

public class VarArg {
	 protected VarArg() {
		// TODO Auto-generated constructor stub
	}
	public String myMethod(int a, String b, float c, double d, String... strings) {
		String returnString = "";
		for (String string : strings) {
			returnString += string + " ";
		}

		return returnString;
	}

	public static void main(String[] args) {
		VarArg vr = new VarArg();
		System.out.println(vr.myMethod(1, "b", 10, 20, "HI", "Hello", "My", "Name", "is", "Dont", "know"));

	}
}
