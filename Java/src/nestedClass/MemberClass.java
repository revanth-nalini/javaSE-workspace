package nestedClass;

import nestedClass.StaticClass.StaticNestedClass;

public class MemberClass 
{
	private static String brand = "Sony";
	private int price = 26_000;

	
	static String getBrand() 
	{
		return brand;
	}
	int getPrice() 
	{
		return this.price;
	}
	
	class MemberInnerClass 
	{
		private static final String optType = "Ear Phone";
//		private static String type = "Head Phone";
		static final String optModel = "pods";	
//		static String model = "xm3";
		private int year = 2019;
		int warranty = 2;
		
		/*
		 * static String getType() 
		 * { 
		 * return type; 
		 * }
		 */
		int getYear() {
			return this.year;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Outer Member Class");
		System.out.println(MemberClass.brand);
		
		System.out.println("Outer Member Object");
		MemberClass m = new MemberClass(); 	
		System.out.println(m.brand);
		System.out.println(m.price);
		
		System.out.println("Member Inner Class");
//		System.out.println(m.MemberInnerClass.brand);
//		System.out.println(m.MemberInnerClass.optBrand);
		System.out.println(MemberInnerClass.optType);
		
		System.out.println("Member Inner Object");
		MemberInnerClass mic = m.new MemberInnerClass();
		System.out.println(mic.optType);
		System.out.println(mic.year);
		System.out.println(mic.warranty);
		System.out.println(m.brand);
		System.out.println(m.price);
		
	}
}
