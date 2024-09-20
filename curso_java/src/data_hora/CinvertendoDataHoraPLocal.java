package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CinvertendoDataHoraPLocal {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		/* retorna coleção com os nomes dos fusos horários customizados
		for( String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
	
		// converter data global para local considerando o fuso horário do pc
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("R1 = " + r1);
		
		
		//converter data global para local considerando o fuso horário de algum lugar
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("R2 = " + r2);
		
		
		// converter data global para local considerando o fuso horário do pc
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println("R3 = " + r3);
		
		
		//converter data global para local considerando o fuso horário de algum lugar
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println("R4 = " + r4);
		
		
		// buscando apenas dia, mês ou ano (Usando LocalDate)
		
		// buscando: dia
		System.out.println("Dia do d04: " + d04.getDayOfMonth());
		
		// buscando mês
		System.out.println("Mês do d04: " + d04.getMonthValue());
		
		// buscando ano
		System.out.println("Ano do d04: " + d04.getYear());
		
		
		// buscando apenas dia, mês, ano, hora, minutos ou segundos (Usando LocalDateTime)
		
		// buscando: hora
		System.out.println("Dia do d05: " + d05.getHour());
		
		// buscando: minutos
		System.out.println("Dia do d05: " + d05.getMinute());
	}

}
