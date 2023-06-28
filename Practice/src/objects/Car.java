package objects;

public class Car 
{
	String brand;
	String color;
	double price;
	String model;

	public Car(String brand, String color, double price, String model) 
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.model = model;
	}

	public void show() 
	{
		System.out.println("This is the brand new BMW car ");
		System.out.println("Brand name is "+brand);
		System.out.println("The price of BMW is "+price);
		System.out.println("Model name is "+model);
	}

	public static void main(String[] args) 
	{
		Car car=new Car("BMW","Red", 2505000.55, "BMW 7");
		car.show();
	}
}
