package com.sample.triangle;

import junit.framework.TestCase;

public class PermutationsTest extends TestCase {

	public void testTriangleEquilateral() {
		Triangle triangle = new Triangle(2, 2, 2);
		Permutations permutations = new Permutations();
		assertEquals(permutations.get(triangle).size(), 1);
	}

	public void testTriangleIsoceleAB() {
		Triangle triangle = new Triangle(2, 2, 3);
		Permutations permutations = new Permutations();
		assertEquals(permutations.get(triangle).size(), 3);
	}

	public void testTriangleIsoceleAC() {
		Triangle triangle = new Triangle(2, 3, 2);
		Permutations permutations = new Permutations();
		assertEquals(permutations.get(triangle).size(), 3);
	}

	public void testTriangleIsoceleBC() {
		Triangle triangle = new Triangle(3, 2, 2);
		Permutations permutations = new Permutations();
		assertEquals(permutations.get(triangle).size(), 3);
	}

	public void testTriangleScalene() {
		Triangle triangle = new Triangle(2, 3, 4);
		Permutations permutations = new Permutations();
		assertEquals(permutations.get(triangle).size(), 6);
	}
}
