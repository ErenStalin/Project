
public class SwappingWithTemporaryVariable {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Befor Swapping "+a+" "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping "+a+" "+b);
	}

}
