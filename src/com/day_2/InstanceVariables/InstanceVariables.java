package com.day_2.InstanceVariables;

/*
 * Instance variables are defined inside the class, but outside of any method, 
 * and are only initialized when the class is instantiated. 
 * Instance variables are the fields that belong to each unique object. 
 * For example, the following code defines fields (instance variables) 
 * for the name, title, and manager for employee objects:
 * Can use any of the four access levels (which means they can be marked with any of the three access modifiers) 
 * Can be marked final 
 * Can be marked transient 
 * Cannot be marked abstract 
 * Cannot be marked synchronized 
 * Cannot be marked strictfp 
 * Cannot be marked native 
 * Cannot be marked static, 
 * because then they'd become class variables.

*/public class InstanceVariables {
	private String name;
	/* private final transient abstract synchronized strictfp native static */ String title;
	private String manager;

	public void logIn() 
	{
		int count = 10;
	
	/*
	 * Typically, you'll initialize a local variable in the same line in which you declare it, 
	 * although you might still need to reinitialize it later in the method. 
	 * The key is to remember that a local variable must be initialized before you try to use it. 
	 * The compiler will reject any code that tries to use a local variable that hasn't been assigned a value,
	 *  because—unlike instance variables—local variables don't get default values.
	 */
		}

}
