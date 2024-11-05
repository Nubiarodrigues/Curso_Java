package uri;

import java.util.Scanner;

public class exe_1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hourInitial = sc.nextInt();
		int minuteInitial = sc.nextInt();

		int hourEnd = sc.nextInt();
		int minuteEnd = sc.nextInt();

		int durationPlay = 0;
		int minutePlay = 0;

		// calculando duração dos minutos
		if (minuteEnd >= minuteInitial) {
			minutePlay = minuteEnd - minuteInitial;
		} else {
			minutePlay = (60 - minuteInitial) + minuteEnd;
		}

		// calculando duração de horas
		durationPlay = hourEnd - hourInitial;

		if (durationPlay < 0) {
			durationPlay += 24;
		}

		System.out.println("O JOGO DUROU " + durationPlay + " HORA (S) E " + minutePlay + " MINUTO (S)");

		sc.close();

	}

}
