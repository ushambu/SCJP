package com.Day_1.declaration;

class Moo extends Zoo {
	private int age=100;
	private void useMyCoolMethod() {
		class subclass {
			public void subClassMethod() {
				System.out.println("SubClass"+age);
				useMyCoolMethod();
				
			}
		}
//		System.out.println("Moo says, " + this.coolMethod());
	}

	public static void main(String[] args) {
		new Moo().useMyCoolMethod();
	}
}
	