package linecomparision;

import java.util.Scanner;

public class LineComparisionProblem {
	static double x1, y1, x2, y2;

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparision Computation Program.");
		System.out.println("enter the values");
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("the lest is:" + line1);
	}

}