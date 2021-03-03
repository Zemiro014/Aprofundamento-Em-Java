package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrdeStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	private Integer id;
	private Date moment;
	private OrdeStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {}

	public Order(Integer id, Client client, OrdeStatus status, Date moment) {
		setId(id);
		setMoment(moment);
		setStatus(status);
		setClient(client);
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrdeStatus getStatus() {
		return status;
	}

	public void setStatus(OrdeStatus status) {
		this.status = status;
	}	

	public List<OrderItem> getItems() {
		return items;
	}

	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem it : items) {
			sum += it.subTota();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+sdf.format(getMoment())+"\n");
		sb.append("Order statud: "+getStatus()+"\n");
		sb.append("Client: " +getClient().getName()+" ("+sdf2.format(getClient().getBirthDate())+") - "+getClient().getEmail() +"\n");
		sb.append("Order items: \n");
		for (OrderItem it : items) {
			sb.append(it.getProduct().getName()+ ", Quantity: "+ it.getQuantity()+", Subtotal: "+it.subTota() +"\n");
		}
		sb.append("Total price: "+total()+"\n");
		
		return sb.toString();
	}
}
