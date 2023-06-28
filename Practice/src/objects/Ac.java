package objects;

public class Ac 
{
	String brand;
	double price;
	String color;


	public Ac(String brand, double price, String color) 
	{
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public void check() 
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
	}


	public static void main(String[] args) 
	{
		Ac ac=new Ac("LG", 27499.99, "Black");
		ac.check();
	}
}
