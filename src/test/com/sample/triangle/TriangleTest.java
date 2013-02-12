package com.sample.triangle;

import java.util.Iterator;

import junit.framework.TestCase;

public class TriangleTest extends TestCase {

	public void testTroisLongueursIdentiques() {
		Triangle triangle = new Triangle(2.1, 2.1, 2.1);
		assertEquals(TriangleType.EQUILATERAL, triangle.getType());
	}

	public void testDeuxLongueursIdentiques() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(2.1, 2.1, 3)).iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.ISOCELE, it.next().getType());
		}
	}

	public void testUneLongueurNulleTriangleValide() {
		Iterator<Triangle> it = new Permutations().get(new Triangle(0, 1, 1))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.DEGENERE_EN_AIGUILLE, it.next().getType());
		}
	}

	public void testUneLongueurNulleTriangleInvalide() {
		Iterator<Triangle> it = new Permutations().get(new Triangle(0, 1, 2))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.PAS_UN_TRIANGLE, it.next().getType());
		}
	}

	public void testDeuxLongueursNulles() {
		Iterator<Triangle> it = new Permutations().get(new Triangle(0, 0, 1))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.PAS_UN_TRIANGLE, it.next().getType());
		}
	}

	public void testTroisLongueursNulles() {
		Iterator<Triangle> it = new Permutations().get(new Triangle(0, 0, 0))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.PAS_UN_TRIANGLE, it.next().getType());
		}
	}

	public void testUneLongueurNegative() {
		Iterator<Triangle> it = new Permutations().get(new Triangle(-1, 1, 1))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.PAS_UN_TRIANGLE, it.next().getType());
		}
	}

	public void testTroisSommetsAlignes() {
		Iterator<Triangle> it = new Permutations().get(new Triangle(1, 2, 3))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.PLAT, it.next().getType());
		}
	}

	public void testUneLongueurTropGrande() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(2.0001, 1, 1)).iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.PAS_UN_TRIANGLE, it.next().getType());
		}
	}

	public void testPythagore() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(2, 5, Math.sqrt(29))).iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.RECTANGLE, it.next().getType());
		}
	}

	public void testPythagoreDeuxLongueurIdentiques() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(2, 2, Math.sqrt(8))).iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.DEMI_CARRE, it.next().getType());
		}
	}

	public void testTroisQuatreCinq() {
		Iterator<Triangle> it = new Permutations().get(new Triangle(3, 4, 5))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.ARPENTEURS, it.next().getType());
		}
	}

	public void testSixHuitDix() {
		Iterator<Triangle> it = new Permutations().get(new Triangle(6, 8, 10))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.ARPENTEURS, it.next().getType());
		}
	}

	public void testDeuxGrandesLongueursEntieresIdentiquesEtUneGrandeLongueur() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE,
						Integer.MAX_VALUE - 1)).iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.ISOCELE, it.next().getType());
		}
	}

	public void testDeuxGrandesLongueursEntieresIdentiquesEtUnePetiteLongueur() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE, 1))
				.iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.ISOCELE, it.next().getType());
		}
	}

	public void testDeuxGrandesLongueursDoubleIdentiquesEtUnePetiteLongueur() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(Double.MAX_VALUE, Double.MAX_VALUE, 1)).iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.ISOCELE, it.next().getType());
		}
	}

	public void testDeuxGrandesLongueursDoubleIdentiquesEtUneGrandeLongueur() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(Double.MAX_VALUE, Double.MAX_VALUE,
						Double.MAX_VALUE - 1)).iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.ISOCELE, it.next().getType());
		}
	}

	public void testKepler() {
		Iterator<Triangle> it = new Permutations().get(
				new Triangle(1, (1 + Math.sqrt(5)) / 2, Math.pow(
						(1 + Math.sqrt(5)) / 2, 2))).iterator();
		while (it.hasNext()) {
			assertEquals(TriangleType.KEPLER, it.next().getType());
		}
	}
}
