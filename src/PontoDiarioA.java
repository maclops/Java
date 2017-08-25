
public class PontoDiario {
	
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
		} else {
			return minutosPonto - minutosReferencial;
		}
		
	}
	
	Integer converteHoraMinuto(String horaString) {
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
