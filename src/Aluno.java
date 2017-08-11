
public class Aluno {

	String ra;
	String nome;
	Telefone[] telefones = new Telefone[20];

	public String toString() {

		return "Nome: " + nome + "\nRA: " + ra + "\nTelefone: " + telefones;
	}
}
