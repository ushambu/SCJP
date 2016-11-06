package com.day_2.protectedPk.parent;

/*
 * Protected and Default Members    
 * The protected and default access control levels are almost identical, 
 * but with one critical difference. 
 * 
 * A default member may be accessed only if the class accessing the member belongs to the same package, 
 * whereas a protected member can be accessed (through inheritance) by a subclass even if 
 * the subclass is in a different package. 
*/

public class ParentClass {
protected String name;
protected int id;
}
class OneMoreChild extends ParentClass
{
void oneMoreMethod()
{
	name="name";
}
}
