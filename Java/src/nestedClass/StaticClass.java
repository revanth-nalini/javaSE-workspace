package nestedClass;

public class StaticClass 
{

	private static String brand = "Sony";
	static String optBrand = "Bose";
	private int price = 26_000;
	int optPrice = 30_000;
	
	static String getBrand() 
	{
		return brand;
	}
	int getPrice() 
	{
		return this.price;
	}
	
	static class StaticNestedClass
	{
		private static String type = "Head Phone";
		static String model = "xm3";
		private int year = 2019;
		int warranty = 2;
		
		static String getType() 
		{
			return type;
		}
		int getYear() 
		{
			return this.year;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Outer Static Class");
		System.out.println(StaticClass.brand);
		
		System.out.println("Outer Static Object");
		StaticClass s = new StaticClass(); 	
		System.out.println(s.brand);
		System.out.println(s.price);
	
		System.out.println("Static Nested Class");
//		System.out.println(StaticNestedClass.brand);
//		System.out.println(StaticNestedClass.optBrand);
		System.out.println(StaticNestedClass.type);
		System.out.println(StaticNestedClass.model);
		
		
		System.out.println("Static Nested Object");
		StaticClass.StaticNestedClass snc = new StaticNestedClass();
		System.out.println(snc.type);
		System.out.println(snc.model);
		System.out.println(snc.year);
		System.out.println(snc.warranty);
//		System.out.println(snc.brand);
//		System.out.println(snc.optBrand);
//		System.out.println(snc.price);
//		System.out.println(snc.optPrice);
	}
}
