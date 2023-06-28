package objects;

public class Add {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Add add=new Add();
		int result=add.add(4,6);
		double result1= add.add(87.34, 34.43);
		System.out.println(result1);
	}
}