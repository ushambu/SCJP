package com.day_2.LocalVariablesAccessModifiers;


/*Can access modifiers be applied to local variables?  NO!
 *There is never a case where an access modifier can be applied to a local variable,
 * so watch out for code like the following:
class Foo {  void doStuff() {    private int x = 7;    this.doMore(x);  } }
You can be certain that any local variable declared with an access modifier 
will not compile. In fact, there is only one modifier that can ever be applied to
 local variables—final. That about does it for our discussion on member access modifiers. 

*/


public class LocalVariablesAccessModifiers {
void myMethod()
{
	/*private protected public*/ final int a=9;
}
}
