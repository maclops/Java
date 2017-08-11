import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		String adicionar = "N";
		do {
			System.out.println("Deseja adicionar um novo cliente? (S|N)?");
			adicionar = sc.nextLine().toUpperCase();
			if (adicionar.equals("S")) {
				Cliente novoCliente = lerCliente();
				clientes.add(novoCliente);
			} else {
				System.out.println("Obrigado e volte sempre!");
			}
		}
		while (adicionar.equals("S"));
		sc.close();
		
		for (int i=0; i < clientes.size(); i++) {
			System.out.println("Imprimindo cliente na posição: "+i);
			System.out.println("Nome: "+clientes.get(i).nome);
			System.out.println("Idade: "+clientes.get(i).idade);
			System.out.println("Cpf: "+clientes.get(i).cpf);
			System.out.println("Telefone: "+clientes.get(i).telefone);
			
		}
	}

	private static Cliente lerCliente() {
		Cliente cliente = new Cliente();
		System.out.println("Digite o CPF:");
		cliente.cpf = sc.nextLine();
		System.out.println("Digite a Idade:");
		cliente.idade = sc.nextInt();
		System.out.println("Digite o Nome:");
		sc.nextLine();
		cliente.nome = sc.nextLine();
		System.out.println("Digite o Telefone:");
		cliente.telefone = sc.nextLine();
		return cliente;
	}
}

class Cliente {
	String cpf;
	Integer idade;
	String nome;
	String telefone;

	public String toString() {
		
			/*
			 * ou usar assim:
			 * System.out.println("Imprimindo clientes na posição: "+i+" - "+clientes.get(i));
			 */
		return "Nome: "+nome+" idade: "+idade+" cpf: "+cpf+" telefone: "+telefone;
	}
	
}