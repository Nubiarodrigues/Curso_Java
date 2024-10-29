package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoParaTexto {

	public static void main(String[] args) {

		// Criação de objetos de data e hora a partir de strings
        LocalDate d01 = LocalDate.parse("2022-07-20"); // Data (sem hora)
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26"); // Data e hora
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z"); // Instante (data e hora em UTC)

        // Formatadores para diferentes estilos de data/hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato: dia/mês/ano
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Formato: dia/mês/ano hora:minuto

        // Formatação do Instant, com conversão para a hora local
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // Formato ISO para data e hora local
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        // Formato ISO para Instant (com fuso horário)
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        // Impressão das datas formatadas
        System.out.println("d01 = " + d01.format(fmt1)); // Exibe d01 no formato dd/MM/yyyy
        System.out.println("d01 = " + fmt1.format(d01)); // Outra forma de exibir d01

        // Impressão de d01 usando formatação inline
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Impressão de d02 formatada
        System.out.println("d02 = " + d02.format(fmt1)); // Exibe apenas a data de d02
        System.out.println("d02 = " + d02.format(fmt2)); // Exibe data e hora de d02

        // Impressão de d03 formatada com a hora local
        System.out.println("d03 = " + fmt3.format(d03)); // Exibe d03 na hora local

        // Impressão de d03 no formato ISO
        System.out.println("d03 = " + fmt5.format(d03)); // Exibe d03 no formato ISO

        // Impressão de d02 no formato ISO
        System.out.println("d02 = " + d02.format(fmt4)); // Exibe d02 no formato ISO

	}

}
