package arrays_program;

public class Reverse_String_Approch1_by_length_charAT {

	public static void main(String[] args) {
		
		//Approch-1 by using length(), and charAt()
		
		String s="Selenium";
		
		//we taken one string type variable empty for store reversing value in this 
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
		rev= rev+s.charAt(i);
		}
		System.out.println("Reversed string is: " + rev);
		
		
	}

}
