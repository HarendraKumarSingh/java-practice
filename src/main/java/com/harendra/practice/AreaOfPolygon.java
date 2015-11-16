package com.harendra.practice;

/**
 * 
 * @author harendra Find are of a polygon whose vertices coordinated are given
 */
public class AreaOfPolygon {

	/**
	 * 
	 * @param x Arrays of the x coordinates of each vertices, traced in a clockwise direction(can also be done in counter clock wise).
	 * @param y	Arrays of the y coordinates of the vertices, traced in a clockwise direction.
	 * @param	VertexCount Vertices count of the given polygon
	 * @return	Area of the given polygon
	 */
	public int getAreaOfPolygon(int[] x, int[] y, int vertexCount) {

		int spaceArea = 0;
		int j = vertexCount - 1;
		for (int i = 0; i < vertexCount; i++) {
			spaceArea = spaceArea + (x[i] + x[j]) * (y[j] - y[i]);
			j = i;
		}
		return spaceArea / 2;

	}

	public static void main(String[] args) {
		AreaOfPolygon areaOfPolygon = new AreaOfPolygon();
		// input vertex coordinates(moving clockwise) sample-1 :{(0,0), (0,10),
		// (10,10),
		// (10,0)} , sample-2: {(-4,-4), (-4,4), (4,4), (4,-4)} , sample-3:
		// {(4,6), (4,-4), (8,-4),
		// (8,-8), (-4,-8),(-4,6)}
		int[] x = { 4, 4, 8, 8, -4, -4 };
		int[] y = { 6, -4, -4, -8, -8, 6 };
		int vertexCount = x.length;
		int areaOfPolygone = areaOfPolygon.getAreaOfPolygon(x, y, vertexCount);
		System.out
				.println("Area of give polygone {(4,6),  (4,-4),  (8,-4),  (8,-8), (-4,-8),(-4,6)} is : "
						+ areaOfPolygone);

	}
}
