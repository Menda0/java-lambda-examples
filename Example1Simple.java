public class Example1{
	interface HelloWorld{
		void sayHelloWorld(String message);
	}
	public static void main(String[] args){
		HelloWorld msg1 = (String message) -> {System.out.println(message);};
		msg1.sayHelloWorld("HelloWorld");
	}
}