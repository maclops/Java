import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		Integer QT = Integer.parseInt(scanner.nextLine());
		String[] respostas = new String[QT];
		//loop sobre a quantidade de entradas
		for (int i = 0;i<QT;i++) {
			Integer N = Integer.parseInt(scanner.nextLine());			
			PontoDiario[] pontos = new PontoDiario[N];
			// loop sobre a quantidade de pontos diários sobre cada entrada
			for (int j = 0;j<N;j++) {
				String ponto = scanner.nextLine();
				String[] entradas = ponto.split(" ");
				
				PontoDiario pontoDiario = new PontoDiario();
				pontoDiario.entradaPrimeiro = entradas[0];
				pontoDiario.saidaPrimeiro = entradas[1];
				pontoDiario.entradaSegundo = entradas[3];
				pontoDiario.saidaSegundo = entradas[4];
				pontos[j] = pontoDiario;												
			}
			//calculando o saldo de horas sobre cada entrada
			Integer saldoHoras = 0;
			for (int j = 0; j < pontos.length;j++) {
				saldoHoras += pontos[j].calculaSaldoHoras();
			}
			respostas[i] = PontoDiario.converteMinutoHora(saldoHoras);
		}
		for (String resposta: respostas) {
			System.out.println(resposta);
		}

	}
	
}


class PontoDiario {
	
	String entradaPrimeiro;
	
	String saidaPrimeiro;
	
	String entradaSegundo;
	
	String saidaSegundo;
	
	public Integer calculaSaldoHoras() {
		Integer saldo = 0;
		saldo += calculaHoraPonto(entradaPrimeiro,"08:00",1);
		saldo += calculaHoraPonto(saidaPrimeiro,"12:00",2);
		saldo += calculaHoraPonto(entradaSegundo,"14:00",1);
		saldo += calculaHoraPonto(saidaSegundo,"18:00",2);
		return saldo;
	}

	private Integer calculaHoraPonto(String ponto, String referencial,int entradaSaida) {
		Integer minutosPonto = converteHoraMinuto(ponto);
		Integer minutosReferencial = converteHoraMinuto(referencial);
		Integer diferenca = minutosReferencial - minutosPonto;
		if (diferenca >= -5 && diferenca <= 5) {
			return 0;
		}
		if (entradaSaida == 1) {
			return minutosReferencial - minutosPonto;
		} 
		return minutosPonto - minutosReferencial;
		
	}
	
	private Integer converteHoraMinuto(String horaString) {
		String[] horaMinuto1 = horaString.split(":");
		Integer quantidadeMinutos1 = Integer.parseInt(horaMinuto1[0]) * 60;
		quantidadeMinutos1 += Integer.parseInt(horaMinuto1[1]);
		return quantidadeMinutos1;
	}
	
	public static String converteMinutoHora(Integer minuto) {
		Integer minutos = minuto % 60;
		Integer horas = minuto / 60;	
		String resposta = "";
		minutos = Math.abs(minutos);
		horas = Math.abs(horas);
		if (minuto < 0) {
			resposta += "- ";
		} else {
			resposta += "+ ";
		}
		if (horas < 10) {
			resposta += "0"+horas+":";
		} else {
			resposta += horas+":";
		}
		if (minutos < 10) {
			resposta += "0"+minutos;
		} else {
			resposta += minutos;
		}
		return resposta;
	}

}

