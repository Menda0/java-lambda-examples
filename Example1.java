public class Example1{

	@FunctionalInterface
	interface HelloWorld{
		default void sayGoodBye(){
			System.out.println("adeus mundo");
		}

		void sayHelloWorld(String message);
		//void xpto(String xxxx);
	}

	class HelloWorldImpl implements HelloWorld{
		public void sayHelloWorld(String message){
			System.out.println(message);
		}
	}

	public static void main(String[] args){

		//HelloWorld msg = new HelloWorldImpl();

		HelloWorld msg1 = (String message) -> {System.out.println(message);};
		HelloWorld msg2 = (message) -> {System.out.println(message);};
		HelloWorld msg3 = message -> {System.out.println(message);};
		HelloWorld msg4 = message -> System.out.println(message);

		msg1.sayHelloWorld("HelloWorld");
		msg2.sayHelloWorld("HelloWorld");
		msg3.sayHelloWorld("HelloWorld");
		msg4.sayHelloWorld("HelloWorld");
		msg1.sayGoodBye();

	}

}