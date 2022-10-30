package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items=new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status) {
		super();
		this.moment = moment;
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		this.getItems().add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.getItems().remove(item);
	}
	
	public Double total() {
		Double total=(double)0;
		for (OrderItem o: this.getItems()) {
			total+=o.subTotal();
		}
		return total;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("ORDER SUMMARY:\nOrder moment: "+sdf.format(this.getMoment()));
		
		return "Order [moment=" + moment + ", status=" + status + ", items=" + items + "]";
	}
	
}
