package entities;

import entities.enums.Color;

/*
 * Se em uma class houver a necessidade de ter um m�todo "abstract" (m�todo em que a sua implementa��o depende exclusivamente da "subclass" desta "class" em quest�o), essa class deve ser "abstract" tamb�m.
 * 
 * E essa class n�o poder� ser instanciada de jeito algum
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
	
	public abstract double area(); // M�todo "abstract": sua implementa��o depende das "subclasses" da "class Shape"

}
