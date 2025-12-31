package arrays_program;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		//Approch 1 
		//this is we can use when we know the actual size of array 
		int[] a = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		//System.out.println("This is Array of length: " + a.length);
		//System.out.println("Value of index: " + a[4]);
		
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/

		
		//Approch 2 
		int [] b = {100,200,300,400,500,600};
		System.out.println("This is size of array "+ b.length);
		
		//Enanced for loop 
		for(int numValue:b) {
			System.out.println("This is values of array : " + numValue);
		}
		
	}

}
