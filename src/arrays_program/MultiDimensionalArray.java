package arrays_program;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		// Approch 1
		/*
		 * int [][]a = new int[3][3];
		 * 
		 * a[0][0]=10; a[0][1]=20; a[0][2]=30; //a[0][4]=10;
		 */

		int[][] a = { { 10, 20, 30, }, { 40, 50, 60 }, { 70, 80, 90 } };

		 System.out.println(a.length);
		for (int arr[] : a) {

			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();

		}

	}

}
