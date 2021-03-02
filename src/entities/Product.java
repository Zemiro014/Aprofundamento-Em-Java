package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product(){
	}
	
	public Product(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
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
				+", pre�o: "
				+String.format("%.2f", price)
				+ ",  quantidade: "+quantity
				+", total: "
				+String.format("%.2f", TotalValueInStock());
	}
}
