
public class Circle {
	
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setReturn(double radius)
	{
		this.radius=radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}

	

}
