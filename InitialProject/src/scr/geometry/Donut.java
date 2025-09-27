package scr.geometry;

public class Donut extends Circle {

	private int innerRadius;
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		this.setSelected(selected);
	}
	
	public String toString() {
		return super.toString() + ", innerRadius = " + getInnerRadius();
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			Donut pomocna = (Donut) obj;
			if (super.equals(pomocna) &&
					this.innerRadius == pomocna.innerRadius)
				return true;
			else
				return false;
		} else
			return false;
	}
	
	public boolean contains(int x, int y) {
		return (super.contains(x, y) && 
				getCenter().distance(x,y)> innerRadius);
	}
	
	public double area() { 
		double area = super.area() - innerRadius*innerRadius*Math.PI;
		return area;
	}
	
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public int getInnerRadius() {
		return this.innerRadius;
	}

}