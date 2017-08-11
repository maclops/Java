import java.util.Scanner;

public class Principal1 {

	public static void main(String Args[]) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Inserindo novo aluno");
		System.out.println("Digite o R.A.");
		aluno.ra = sc.nextLine();
		System.out.println("Digite o nome");
		aluno.nome = sc.nextLine();
		System.out.println("Informe quantos telefones serão inseridos");
		Integer quantosTelefones = sc.nextInt();
		for (int i=0; i<quantosTelefones; i++) {
			Telefone telefone = new Telefone();
			System.out.println("Digite o tipo de telefone");
			sc.next();
			telefone.tipo = sc.nextLine();
			System.out.println("Digite o número do telefone");
			telefone.numero = sc.nextLine();
			aluno.telefones[i] = telefone;
		}
		System.out.println(aluno);
		
		sc.close();
	}
}
