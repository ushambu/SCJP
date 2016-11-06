package com.day_2.Synchronized;

/*
 * Synchronized Methods    The synchronized keyword indicates that a method can be accessed by only one thread at a time. We'll discuss this nearly to death in Chapter 9, but for now all we're concerned with is knowing that the synchronized modifier can be applied only to methods—not variables, not classes, just methods. A typical synchronized declaration looks like this:
public synchronized Record retrieveUserInfo(int id) { }

*/

  public class SynchronizedEx {
	  synchronized int a() {
		return 0;
	}
}
