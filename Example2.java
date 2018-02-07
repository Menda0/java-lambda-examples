 public class Example2 {

 	interface MathOperation{
 		int preform(int a,int b);
 	}

 	public static void main(String[] args) {
 		MathOperation add = (a,b) -> {return a+b;};

 		MathOperation myop = (a,b) -> a*a+b*b;

 		System.out.println(add.preform(10,10));	
 		System.out.println(myop.preform(10,10));
 	}

 }