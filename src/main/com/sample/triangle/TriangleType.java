package com.sample.triangle;

/**
 * Voir : http://fr.wikipedia.org/wiki/Triangle
 */
public enum TriangleType {
	EQUILATERAL,
	ISOCELE,
	PLAT,
	DEGENERE_EN_AIGUILLE,
	SCALENE,
	PAS_UN_TRIANGLE,
	RECTANGLE, // a^2=b^2+c^2
	DEMI_CARRE, // isocele et rectangle
	ARPENTEURS, // 3, 4, 5
	KEPLER, // 1, (1+v5)/2, ((1+v5)/2)^2
	OR, // isocele et 36°, 72°, 72° A=arccos((a²-b²-c²)/-2*b*c)
	ECOLIER_HEMI_EQUILATERAL, // rectangle et 30°, 60°, 90°
	OR_BISOCELE, // Un triangle est dit bisocele si l'une de ses bissectrices le partage en deux triangles isoceles. Il ne peut s'agir que du demi-carre ou d'un triangle d'or
	DEMI_CARRE_BISOCELE
}
