import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	// Add your code here
	public Difference(int[] a) {
		this.elements = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			this.elements[i] = a[i];
		}
		this.maximumDifference = 0;
	}

	public int computeDifference() {
		int max = 0;
		int min = 9999;
		for (int i : this.elements) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		return (max - min);
	}
} // End of Difference class

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}