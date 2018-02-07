import java.util.*;
import java.util.function.*;

public class Example5{
	
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9);

		Predicate encontraOSeis = r -> r.equals(6);

		IntPredicate encontraMaiorSeis = r -> r > 6;

		list.forEach(item -> {
			if(encontraOSeis.test(item)){
				System.out.println("Encontrei o seis");
			}
		});

		list.forEach(item -> {
			if(encontraMaiorSeis.test(item)){
				System.out.println("Encontrei maior que seis:"+item);
			}
		});

	}
}