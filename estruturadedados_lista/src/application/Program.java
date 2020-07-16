package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Pedro");
		list.add("Alex");
		list.add("Davi");
		list.add("Ana");
		list.add(2,"Marco");
		
		System.out.println(list.size()); //tamanho lista
		
		for(String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("-----------------");
		list.removeIf(nomes -> nomes.charAt(0) == 'M');
		for(String nomes : list) {
			System.out.println(nomes);
		}
		System.out.println("------------------");
		System.out.println("Index do Davi : " + list.indexOf("Davi"));
		System.out.println("Index do Marco : " + list.indexOf("Marco"));
		System.out.println("------------------");
		List<String> result = list.stream().filter(nomes -> nomes.charAt(0) == 'A').collect(Collectors.toList()); // filtrar nome com letra que começa com 'A"
		for(String nomes : result) {
			System.out.println(nomes);
		}
		System.out.println("------------------");
		String nome  = list.stream().filter(nomes -> nomes.charAt(0) == 'D').findFirst().orElse(null);
		System.out.println(nome);
	}

}
