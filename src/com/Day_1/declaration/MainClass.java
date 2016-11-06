package com.Day_1.declaration;

import com.Day_1.declaration.MainClass.mainSubClass.MainInterface;

class MainClass {
	
	public String mainMethod()
	{
		class myclass implements MainInterface
		{

			@Override
			public String useme() {
				
				class submyclass implements MainInterface
				{

					@Override
					public String useme() {
						
						return "U have used submainclass";
					}
					
				}
				return new submyclass().useme(); 
			}
			
		} 
		return new myclass().useme();
	}
	public static void main(String[] args) {
System.out.println(new MainClass().mainMethod());
	}
	interface mainSubClass{
	interface  MainInterface{
		String mainvar="this is main var in interface";
		 static String method() {
			return "This is interface method";
		}
		 String useme();
	}
	}
}
