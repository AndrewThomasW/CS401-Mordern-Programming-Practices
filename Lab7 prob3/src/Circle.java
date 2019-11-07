

public class Circle implements ClosedCurve {

	//fields
	private double radius;

	//constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}

	//setter and getter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}
