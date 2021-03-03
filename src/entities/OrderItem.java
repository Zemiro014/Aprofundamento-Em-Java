package entities;

public class OrderItem 
{
	private Integer quantity;
	private Product product;
	
	public OrderItem() {}
	
	public OrderItem(int quantity, Product product) {
		addQuantity(quantity);
		setProduct(product);
	}	
	
	
	public Integer getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void addQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public double subTota() 
	{
		return quantity * product.getPrice();
	}
	
	
}
