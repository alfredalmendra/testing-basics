package com.sample.triangle;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public List<Triangle> get(Triangle triangle) {
		List<Triangle> liste = new ArrayList<Triangle>();
		if (triangle == null) {
			return liste;
		}
		boolean aDifferentDeB = triangle.getA() != triangle.getB();
		boolean bDifferentDeC = triangle.getB() != triangle.getC();
		boolean aDifferentDeC = triangle.getA() != triangle.getC();
		liste.add(triangle);
		if (bDifferentDeC) {
			liste.add(new Triangle(triangle.getA(), triangle.getC(), triangle
					.getB()));
		}
		if (aDifferentDeB) {
			liste.add(new Triangle(triangle.getB(), triangle.getA(), triangle
					.getC()));
			if (aDifferentDeC && bDifferentDeC) {
				liste.add(new Triangle(triangle.getB(), triangle.getC(),
						triangle.getA()));
			}
		}
		if (aDifferentDeC) {
			liste.add(new Triangle(triangle.getC(), triangle.getA(), triangle
					.getB()));
			if (aDifferentDeB && bDifferentDeC) {
				liste.add(new Triangle(triangle.getC(), triangle.getB(),
						triangle.getA()));
			}
		}
		return liste;
	}
}
