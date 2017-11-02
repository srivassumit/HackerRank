package com.zappos;

/**
 * @author Sumit
 *
 */
public class BermudaTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

	static int foundInBermudatriangle(int x1, int y1, int x2, int y2, int x3, int y3, int px, int py, int bx, int by) {
		float bermudaTriangeArea = triangleArea(x1, y1, x2, y2, x3, y3);
		if (bermudaTriangeArea < 0) {
			return 0;
		}
		boolean planeGone = false;
		boolean boatGone = false;
		float plane1 = triangleArea(x1, y1, x2, y2, px, py);
		float plane2 = triangleArea(x1, y1, px, py, x3, y3);
		float plane3 = triangleArea(px, py, x2, y2, x3, y3);
		float boat1 = triangleArea(x1, y1, x2, y2, bx, by);
		float boat2 = triangleArea(x1, y1, bx, by, x3, y3);
		float boat3 = triangleArea(bx, by, x2, y2, x3, y3);
		if (bermudaTriangeArea == plane1 + plane2 + plane3) {
			planeGone = true;
		}
		if (bermudaTriangeArea == boat1 + boat2 + boat3) {
			boatGone = true;
		}
		if (planeGone && !boatGone) {
			return 1;
		} else if (!planeGone && boatGone) {
			return 2;
		} else if (planeGone && boatGone) {
			return 3;
		} else if (!planeGone && !boatGone) {
			return 4;
		}
		return 0;
	}

	static float triangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
		return (float) Math.abs(((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0));
	}

}
