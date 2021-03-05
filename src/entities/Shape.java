package entities;

import entities.enums.Color;

/*
 * Se em uma class houver a necessidade de ter um método "abstract" (método em que a sua implementação depende exclusivamente da "subclass" desta "class" em questão), essa class deve ser "abstract" também.
 * 
 * E essa class não poderá ser instanciada de jeito algum
 * */ 
public abstract class Shape
{
	private Color color;

	public Shape() {}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area(); // Método "abstract": sua implementação depende das "subclasses" da "class Shape"

}
