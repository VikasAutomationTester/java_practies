package logical_quetions_by_srikar_sir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Remove_The_Value_Randomly {

	public static void main(String[] args) {

		Integer[] arr = { 3, 1, 2, 3, 4, 5 };
		List <Integer> List = new ArrayList<>(Arrays.asList(arr));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Current array : " + List);
		System.out.println(" Enter the value want to remove randomly: ");
		int valueToremove = scanner.nextInt();
		
		//Collect all indices of the requested value
		List<Integer> indices = new ArrayList<>();
		
		for(int i=0;i<List.size();i++) {
			if(List.get(i) == valueToremove)
			{
				indices.add(i);
			}
			
		}
		
		if(indices.isEmpty()) {
			System.out.println("value not found in the array.");
		}else {
			//Randomly pick one index from the indices list
			
			int randomIndex = indices.get((int)(Math.random() * indices.size()));
			List.remove(randomIndex);
			
			System.out.println(" Array after removing one occurance of " + valueToremove + ":" + List);
		}
		
		/*This code:
		
		Takes an initial array of integers.
		
		Converts it to an ArrayList to allow removal.
		
		Prompts the user to enter a value they want to remove.
		
		Finds all occurrences of this value.
		
		Randomly removes one occurrence if found.
		
		Prints the updated list.
		
		This handles the case where the value appears multiple times, removing one instance randomly.
		*/
		
		
		
		
	}
}
