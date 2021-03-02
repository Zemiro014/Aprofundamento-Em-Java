package entities;

import java.util.Date;

import entities.enums.OrdeStatus;

public class Order {
	
	private Integer id;
	private Date moment;
	private OrdeStatus status;
	
	public Order() {}

	public Order(Integer id, Date moment, OrdeStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
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

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}	
	
	
	
}
