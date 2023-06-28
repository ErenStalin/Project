
public class SwappingWithoutTemporaryariable {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swapping "+a+" "+b);
		a=a+b;  //a=30
		b=a-b;  //b=10
		a=a-b;  //a=20
		System.out.println("After Swapping "+a+" "+b);
	}
}
