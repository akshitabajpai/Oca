package day1;

public class Two {
	public static void main(String[] args) {
		boolean opt=true;
		switch(opt) {  //Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are permitted
		case true:
			System.out.println("True");
			break;
		default:
			System.out.println("***");
		}
		System.out.println("Done");
	}
}
//hence there is error in line 6
//compilation error
/* a) replace line5 with String opt="true" & replace line 6 with case "true"
 * b)replace line 5 with boolean opt=1 & replace line 6 with case 1
 * c)At line remove break statement
 * d)remove default section
 */
// CORRECT OPTION:a