import java.util.*

public class Example4{
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9);

		for(Integer item:list){
			System.out.println(item);
		}

		list.forEach(item -> System.out.println(item));

	}
}