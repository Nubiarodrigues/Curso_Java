package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {

	public static void main(String[] args) {
		
	
		LocalDate d04 = LocalDate.parse("2022-07-20"); // somente data
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // global
		
		//CÁLCULOS
		
		// DateLocal
		
		// criando um localDate como base o d04 para voltar uma semana atrás
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		
		// criando um localDate como base o d04 para avançar uma semana 
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		
		// DateLocalTime
		
		// criando um localDateTime como base o d05 para voltar uma semana atrás
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
				
		// criando um localDateTime como base o d05 para avançar uma semana 
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
				
		
		// Instant
		
		// criando um Instant como base o d06 para voltar uma semana atrás
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekLocalDateTime = " + pastWeekInstant);
						
		// criando um Instant como base o d06 para avançar uma semana 
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		
		
		// DURAÇÃO
		
		// verificando a duração de tempo em dias 
		
		// LocalDate
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("T1 dias: " + t1.toDays());
		
		
		// LocalDateTime
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("T2 dias: " + t2.toDays());
		
		
		// Instant
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("T3 dias: " + t3.toDays());
		

	}

}
