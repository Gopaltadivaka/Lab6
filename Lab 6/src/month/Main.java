package month;

public class Main {

	public static void main(String[] args) {
		Month m1 = new Month(11);
		Month m2 = new Month(1);
		System.out.println("Month m1 name is " + m1);
		System.out.println("Month m2 name is " + m2);
		System.out.println("is m1 equal to m2 ? " + m1.equals(m2));
	}

}
