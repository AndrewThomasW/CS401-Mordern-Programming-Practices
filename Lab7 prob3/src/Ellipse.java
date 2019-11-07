

public class Ellipse implements ClosedCurve {
	private double semiMajorAxis;
	private double ellipticIntegral;

	Ellipse(double semiMajorAxis, double ellipticIntegral) {
		this.semiMajorAxis = semiMajorAxis;
		this.ellipticIntegral = ellipticIntegral;
	}

	@Override
	public double computePerimeter() {

		return 4 * semiMajorAxis * ellipticIntegral;
	}

}
