package arrays_program;

public class Rev_String_App_2_ByUsing_converting_string_to_char_arr_type {

	public static void main(String[] args) {

		String s = "welcome";

		String rev = "";

		char[] a = s.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reversed string is: " + rev);// output: emoclew

	}

}
