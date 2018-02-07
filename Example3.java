import java.util.*;

public class Example3{

	public static void main(String[] args) {

		// Primeira Opção
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("helloworld");
			}
		};
		
		new Thread(r1).start();

		// Segunda Opção
		Runnable r2 = () -> System.out.println("Helloworld mas com lambda");
		new Thread(r2).start();

	}

}