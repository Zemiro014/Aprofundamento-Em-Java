package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(){
	}
	
	public Product(String name, double price, int quantity)
	{
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}
	
	public Product(String name, double price)
	{
		setName(name);
		setPrice(price);
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public double TotalValueInStock() 
	{
		return price * quantity;
	}
	
	public void AddProducts(int quantity) 
	{
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) 
	{
		this.quantity -= quantity;
	}
	
	public String toString() 
	{
		return "Nome: "
				+name 
				+", preço: "
				+String.format("%.2f", price)
				+ ",  quantidade: "+quantity
				+", total: "
				+String.format("%.2f", TotalValueInStock());
	}
}
