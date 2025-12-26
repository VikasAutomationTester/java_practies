package logical_quetions_by_srikar_sir;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Take_an_input_of_List_of_Strings_and_returns_a_list_of_unique_strings {
	
	public static void main(String[]args) {
		
//		interview Question
//		2. Write a Program to take an input of List of Strings and returns a list of unique strings.
//		Input = {“Hyderabad”, “Telangana”, “India”
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter String seprated by comma :");
		String input = scanner.nextLine();
		
		String [] strArray = input.split(",");
		List<String> strList= new ArrayList<>();
		
		for(String s: strArray) {
			strList.add(s.trim());
		}
		
		Set<String> uniqueset = new LinkedHashSet<>(strList);
		List<String> uniqueList = new ArrayList<>(uniqueset);
		
		System.out.println(" List of unique strings : " + uniqueList);
		
		
		
		
	}

}
