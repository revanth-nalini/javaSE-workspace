package enumeration;

public enum ColorEnum 
{
	RED('R',1), BLUE('B',2), GREEN('G',3), YELLOW('Y',4), PINK('P',5);
	
	private char abb;
	private int ranger;
	
	private ColorEnum(char c, int i) 
	{
		this.abb = c;
		this.ranger = i;
		System.out.println(this.toString());
	}
	public void display() 
	{
		System.out.println(this.ranger);
	}
	public static void welcome() 
	{
		System.out.println("Enumeration");
	}
	
	public static void main(String[] args) 
	{
		ColorEnum.welcome();
		ColorEnum c = ColorEnum.RED;
		System.out.println(c);
		
		ColorEnum[] carr = ColorEnum.values();
		for(ColorEnum col : carr) 
		{
			System.out.print(col + " " + col.abb + " " + col.ordinal() + " -> ");
			col.display();
		}
		System.out.println(ColorEnum.valueOf("PINK"));
	}
}

