package com.sample.triangle;

public class Triangle implements TriangleInterface {

	private double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public TriangleType getType() {
		if (a > b + c || b > a + c || c > a + b) {
			return TriangleType.PAS_UN_TRIANGLE;
		}
		if (0 >= a || 0 >= b || 0 >= c) {
			if ((a > 0 && (a == b || a == c)) || (b > 0 && b == c)) {
				return TriangleType.DEGENERE_EN_AIGUILLE;
			}
			return TriangleType.PAS_UN_TRIANGLE;
		}
		if (a == b && b == c) {
			return TriangleType.EQUILATERAL;
		}
		boolean aHypothenuse = isHypotenuse(a, b, c);
		boolean bHypothenuse = isHypotenuse(b, a, c);
		boolean cHypothenuse = isHypotenuse(c, a, b);
		if (aHypothenuse || bHypothenuse || cHypothenuse) {
			if (a == b || b == c || a == c) {
				return TriangleType.DEMI_CARRE;
			}
			if (Math.abs(a - b) == Math.abs(b - c)
					|| Math.abs(a - b) == Math.abs(a - c)
					|| Math.abs(a - c) == Math.abs(b - c)) {
				return TriangleType.ARPENTEURS;
			}
			if (a / b == b / c || a / c == c / b || b / a == a / c) {
				return TriangleType.KEPLER;
			}
			if ((aHypothenuse && (2 * b == a || 2 * c == a))
					|| (bHypothenuse && (2 * a == b || 2 * c == b))
					|| (cHypothenuse && (2 * a == c || 2 * b == c))) {
				return TriangleType.ECOLIER_HEMI_EQUILATERAL;
			}
			return TriangleType.RECTANGLE;
		}
		if (a == b + c || b == a + c || c == a + b) {
			return TriangleType.PLAT;
		}
		if (a == b || b == c || a == c) {
			double angleA = Math.toDegrees(Math.acos((Math.pow(a, 2)
					- Math.pow(b, 2) - Math.pow(c, 2))
					/ (-2 * b * c)));
			double angleB = Math.toDegrees(Math.acos((Math.pow(b, 2)
					- Math.pow(a, 2) - Math.pow(c, 2))
					/ (-2 * a * c)));
			double angleC = Math.toDegrees(Math.acos((Math.pow(c, 2)
					- Math.pow(b, 2) - Math.pow(a, 2))
					/ (-2 * b * a)));
			if (a == b && angleC == 36 || b == c && angleA == 36 || a == c
					&& angleB == 36) {
				return TriangleType.OR;
			}
			return TriangleType.ISOCELE;
		}
		return TriangleType.SCALENE;
	}

	public static boolean isHypotenuse(double hypotenuse, double cote1,
			double cote2) {
		/*
		 * TODO BigDecimal instead of approximation return hypotenuse ==
		 * Math.sqrt(Math.pow(cote1, 2) + Math.pow(cote2, 2));
		 */
		return Math.abs(hypotenuse
				- Math.sqrt(Math.pow(cote1, 2) + Math.pow(cote2, 2))) < 0.000000000000001;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

}
