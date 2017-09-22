import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class estruturaDeDados {

	public static void main(String[] args) {
		
	//	trabalhandoComSet();
	//	trabalhandoComList();
		trabalhandoComMap();
		
	}
	
	private static void trabalhandoComMap() {
		
		Map<String,Integer> quantidadeDeFaltas = new HashMap<>();
	//	Map<String,Integer> quantidadeDeFaltas = new TreeMap<>();

		quantidadeDeFaltas.put("Eloah", 3);
		quantidadeDeFaltas.put("Roberto", 0);
		quantidadeDeFaltas.put("Nayton", 6);
		
	//	Imprimir dinamicamente o conteúdo das chaves, independentemente de entrada (ex: Scanner sc)
		Set<String> chaves = quantidadeDeFaltas.keySet();
		for (String chave: chaves) {
			System.out.println(chave);
		}
		
		
		
		
		
		
		
	}

	private static void trabalhandoComList() {
		
		List<Integer> lista = new ArrayList<>();
	//	List(Integer> lista = new LinkedList<>();
		
		lista.add(1);
		lista.add(1);
		lista.add(1000);
		lista.add(200);
		
		System.out.println(lista.size());
		System.out.println(lista.get(2));
		Collections.sort(lista);
		System.out.println(lista.get(2));
		
	/* 		Pode ser removido assim	
		Integer caraASerRemovido = 200;
		lista.remove(caraASerRemovido);
			OU PODE SER REMOVIDO ASSIM
	*/	lista.remove(new Integer (200));
	
		System.out.println(2);
		
		Set<Integer> conjunto = new LinkedHashSet<>();
		conjunto.add(2);
		conjunto.add(3);
		lista.addAll(conjunto);
		List<Integer> listaConvertida = new ArrayList<>(conjunto);
		for (Integer valor: lista) {
			System.out.println(valor);
		}
		for (Integer valor: conjunto) {
			System.out.println(valor);
		}
		for (int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		lista.set(0, 777); // Coloca valor 777 na posição 0 e remove o valor que estava na posição
	}

	private static void trabalhandoComSet() {
		
		Set<Integer> conjunto = new LinkedHashSet<>();
		boolean adicionei = conjunto.add(1000);
		
		if (adicionei) {
			System.out.println("Adicionou");
		} else {
			System.out.println("Não foi dessa vez");
		}
		conjunto.add(100);
		conjunto.add(1);
		conjunto.add(200);
		boolean adicionei1000Duplicado = conjunto.add(1000);
		System.out.println(adicionei1000Duplicado);
		System.out.println(conjunto.size());
		
		if (conjunto.contains(1)) {
			System.out.println("Boa pinguim, tem o 1");
		}
		if (!conjunto.contains(666)) {
			System.out.println("Não tem bruxaria aqui não");
		}
		System.out.println("-------------");
	
		for (Integer valor: conjunto) {
			System.out.println(valor);
		}
		
	}

}
