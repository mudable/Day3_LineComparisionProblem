package linecomparision;

import java.util.Scanner;

public class LineComparisionProblem {

	static double x1, y1, x2, y2, a1, a2, b1, b2;

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Computation Program.");
		System.out.println("Enter the values for line1");
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		System.out.println("Enter the values for line2");
		a1 = sc.nextDouble();
		a2 = sc.nextDouble();
		b1 = sc.nextDouble();
		b2 = sc.nextDouble();
		double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("The length of line1 is:" + line1);
		String x = Double.toString(line1);

		double line2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("The length of lin2 is:" + line2);
		String y = Double.toString(line2);
		int comp = x.compareTo(y);

		if (comp == 0) {
			System.out.println("Lines are equal");
		} else if (line1 <= line2) {
			System.out.println("Line1 is smaller than line2");
		} else {

			System.out.println("Line1 is greater than line2");
		}
	}

}