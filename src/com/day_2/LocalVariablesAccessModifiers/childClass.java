package com.day_2.LocalVariablesAccessModifiers;

import com.day_2.protectedPk.parent.ParentClass;

public class childClass extends ParentClass
{
	void childMethod(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		
	}
}

