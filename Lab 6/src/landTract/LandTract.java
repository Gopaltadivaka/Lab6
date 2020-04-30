package landTract;

public class LandTract {
	private double tractsLength;
	private double tractswidth;
	private double area;

	public LandTract() {
		area = 0.0;
	}

	public LandTract(double length, double width) {
		tractsLength = length;
		tractswidth = width;
	}

	public double getTractsLength(double tractsLength) {
		return tractsLength;
	}

	public double getWidth(double width) {
		return width;
	}

	public double getArea() {
		area = tractsLength * tractswidth;
		return area;
	}

	public boolean equals(LandTract tract2) {
		return this.area == tract2.area;
	}

	public String toString(int area) {
		return "Area: " + area;
	}

}
