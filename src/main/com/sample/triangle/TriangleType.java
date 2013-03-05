package com.sample.triangle;

/**
 * Voir : http://fr.wikipedia.org/wiki/Triangle
 */
public enum TriangleType {
	PAS_UN_TRIANGLE,
	DEGENERE_EN_AIGUILLE,
	PLAT,
	EQUILATERAL,
	DEMI_CARRE_BISOCELE, // Un triangle est dit bisocele si l'une de ses bissectrices le partage en deux triangles isoceles. Il ne peut s'agir que du demi-carre ou d'un triangle d'or
	OR_BISOCELE, // Un triangle est dit bisocele si l'une de ses bissectrices le partage en deux triangles isoceles. Il ne peut s'agir que du demi-carre ou d'un triangle d'or
	DEMI_CARRE, // isocele et rectangle
	OR, // isocele et 36°, 72°, 72° A=arccos((a²-b²-c²)/-2*b*c)
	ISOCELE,
	ARPENTEURS, // rectangle et c-b == b-a (ex : 3, 4, 5)
	KEPLER, // rectangle et 1, (1+v5)/2, ((1+v5)/2)^2
	ECOLIER_HEMI_EQUILATERAL, // rectangle et 30°, 60°, 90°
	RECTANGLE, // a^2=b^2+c^2
	SCALENE
}
