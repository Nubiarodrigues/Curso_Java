package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enuns.OrderStatus;

public class Order {

	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;

	private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	// lista de produtos
	private List<OrderItem> item = new ArrayList<>();

	public Order() {
	}

	public Order(LocalDateTime momentDate, OrderStatus status, Client client) {
		this.moment = momentDate;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// adicionando item
	public void addItem(OrderItem orderItem) {
		item.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		item.remove(orderItem);
	}

	// método para calcular o total percorrendo a lista
	public Double total() {
		double sum = 0.0;

		for (OrderItem orderItem : item) {
			sum += orderItem.subTotal();
		}

		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(moment.format(sdf) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : item) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	/* O StringBuilder é usado para construir strings de forma eficiente
	 * quando você precisa concatenar várias partes de texto, como no método
	 * toString. A diferença de uso dele e so toString é que o StringBuilder
	 * tem um melhor desempenho quando se trata de textos longos.
	 * */

}
