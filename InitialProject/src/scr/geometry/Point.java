package scr.geometry;

public class Point {
	private int xCoord;
	private int yCoord;
	private boolean selected;
	
	public Point() {
	}
	
	public Point(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	public Point(int xCoord, int yCoord, boolean selected) {
		// this.xCoord = xCoord;
		// this.yCoord = yCoord;
		this(xCoord, yCoord);
		this.selected = selected;
	}
	
	public double distance(Point point2) {
		double dx = xCoord - point2.xCoord;
		double dy = this.yCoord - point2.yCoord;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
	
	public double distance(int xCoord, int yCoord) {
		double dx = this.xCoord - xCoord;
		double dy = this.yCoord - yCoord;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
	
	public String toString() {
		return "("+ xCoord + "," + yCoord + "), selected = " + selected;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point drugaTacka = (Point) obj;
			if (this.xCoord == drugaTacka.xCoord && 
					this.yCoord == drugaTacka.yCoord)
				return true;
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		if (this.distance(x, y) <= 2)
			return true;
		return false;
	}
	
	
	
	
	

	public int getXCoord() {
		return xCoord;
	}

	public void setXCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getYCoord() {
		return yCoord;
	}

	public void setYCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
