package jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
	
	private String name;
	private int age;
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
}

public class JVMClass {

	public static void main(String[] args) 
	{
		Person p = new Person();
		Class c = p.getClass();
		System.out.println("Class Name : " + c.getName());
		
		Method[] methods = c.getDeclaredMethods();
		for(Method m:methods) {
			System.out.println("Method Name : " + m.getName());
		}
		
		Field[] fields = c.getDeclaredFields();
		for(Field f:fields) {
			System.out.println("Field Name : " + f.getName());
		}
		
		Person p2 = new Person();
		Class c2 = p2.getClass();
		System.out.println("c==c2? : " + (c==c2));
		
		System.out.println(String.class.getClassLoader());
		System.out.println(Person.class.getClassLoader());
	}
}