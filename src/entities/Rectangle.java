package entities;

import entities.enums.Color;

/*
 * Todas as classes "n�o abstract" que "herdam" o comportamento de uma class qualquer  abstract que possue m�todos abstracts, devem obrigat�riamente implementar estes m�todos "abstracts"
 * */ 
public class Rectangle extends Shape {

	private Double width;
	private Double height;
	
	public Rectangle() {super();}

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return getHeight() * getWidth() ;
	}

}
