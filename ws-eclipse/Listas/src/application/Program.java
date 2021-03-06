package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>(); 
		
		list.add("Maria");
		list.add("Alex");
		list.add(2, "Marco");
		list.add("Bob");
		list.add("Pedro");
		list.add("Loreta");
		list.add("Lisandra");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		
		
		list.remove("Alex");
		list.remove(0);
		list.removeIf(x -> x.contains("A"));
		System.out.println("Index of Loreta: " + list.indexOf("Loreta"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		System.out.println("------------------");
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println( "-------------");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println(list.size());
		
		System.out.println("------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(name);
	}
}
