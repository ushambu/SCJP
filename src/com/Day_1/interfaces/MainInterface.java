package com.Day_1.interfaces;

/*All interface methods are implicitly public and abstract. 
   In other words, you do not need to actually type the public or abstract modifiers in the method declaration,
   but the method is still always public and abstract. 
 *All variables defined in an interface must be public, static, and final� in other words,
  interfaces can declare only constants, not instance variables.
*Interface methods must not be static.
*Because interface methods are abstract, they cannot be marked final, strictfp,or native.(More on these modifiers later.) 
* An interface can extend one or more other interfaces. 
* An interface cannot extend anything but another interface. 
* An interface cannot implement another interface or class. 
* An interface must be declared with the keyword interface. 
* Interface types can be used polymorphically (see Chapter 2 for more details).
*/
public interface MainInterface {
	static String var = 100 + "";

	static String mainInterfaceMethod() {
		return "This is mainInterfaceMethod";
	}

	default String defaultMethod() {
		return "This is defaultMethod";

	}

	public String useme();
}
