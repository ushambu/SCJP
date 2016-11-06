package com.day_2.NativeMethods;

public class NativeMethod {

	native String myNativeMethod();

}/*
Native Methods    
The native modifier indicates that a method is implemented in platform-dependent code,often in C. 
You don't need to know how to use native methods for the exam, 
other than knowing that native is a modifier (thus a reserved keyword) 
and that native can be applied only to methods—not classes, not variables, just methods.  
Note that a native method's body must be a semicolon (;) (like abstract methods), 
indicating that the implementation is omitted.

 */