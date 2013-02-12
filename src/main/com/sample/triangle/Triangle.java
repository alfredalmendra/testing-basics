package com.sample.triangle;

public class Triangle {

	private double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

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
		if (a == b + c || b == a + c || c == a + b) {
			return TriangleType.PLAT;
		}
		if (a == Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2))
				|| b == Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2))
				|| c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) {
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
			return TriangleType.RECTANGLE;
		}
		if (a == b || b == c || a == c) {
			return TriangleType.ISOCELE;
		}
		return TriangleType.SCALENE;
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
