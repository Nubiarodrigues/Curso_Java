package enumeracoes_composicao.problema1.application;

import java.util.Date;

import enumeracoes_composicao.problema1.entities.Order;
import enumeracoes_composicao.problema1.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {


		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		
		System.out.println(order);
		
		//Conversão de String para enum
		OrderStatus os1 = OrderStatus.DELIVIRED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVIRED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
		
	}

}
