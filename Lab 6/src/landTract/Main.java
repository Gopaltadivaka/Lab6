package landTract;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double length;
		double width;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the tractslength of Tract 1: ");
		length = sc.nextDouble();
		System.out.print("Enter the width of Tract 1: ");
		width = sc.nextDouble();
		LandTract tract1 = new LandTract(length, width);
		System.out.print("Enter the tractslength of tract 2: ");
		length = sc.nextDouble();
		System.out.print("Enter the width of tract 2: ");
		width = sc.nextDouble();
		LandTract tract2 = new LandTract(length, width);
		System.out.println("\nTract 1 Area: " + tract1.getArea());
		System.out.println("Tract 2 Area: " + tract2.getArea() + "\n");
		// Determine whether the two tracts are equal
		if (tract1.equals(tract2))
			System.out.println("The tracts are the same size");
		else
			System.out.println("The tracts are NOT the same size");
	}
}
