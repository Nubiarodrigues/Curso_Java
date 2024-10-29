package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Trabalhando_com_dataHora {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		// Instanciação a partir do instante atual "agora"
		// usando LocalDate, LocaldateTime e Instant a partir do "agora"
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2024-09-19");
		LocalDateTime d05 = LocalDateTime.parse("2024-09-19T01:30:26");
		Instant d06 = Instant.parse("2024-09-19T01:30:26Z");
		Instant d07 = Instant.parse("2024-09-19T01:30:26-03:00");

		//passando como parâmetro como meu texto deve aparecer (CUSTOMIZAR)
		LocalDate d08 = LocalDate.parse("19/09/2024", fmt1); 
		LocalDate d09 = LocalDate.parse("19/09/2024 01:30", fmt2); 
		
		LocalDate d10 = LocalDate.of(2022,9,19);
		LocalDateTime d11 = LocalDateTime.of(2024, 9, 19, 1, 30);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03); //data-hora de Londres GNT 3
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
	}

}
