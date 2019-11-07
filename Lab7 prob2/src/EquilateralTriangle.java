

public class EquilateralTriangle implements Polygon {
	//fields
	private double side;

	//constructor
	EquilateralTriangle(double side) {
		this.side = side;
	}

	@Override
	public double[] getSides() {
		double[] returnValue = { side, side, side };
		return returnValue;
	}

}
