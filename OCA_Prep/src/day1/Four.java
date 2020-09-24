package day1;

public class Four {
	public static void main(String[] args) {
		while(int ii=0;ii<2) {// initialization not allowed in while loop
			ii++;//not resolved to a variable
			System.out.println("ii="+ii);//ii is not resolved to a variable
		}
	}

}
// CORRECT ANSWER: compilation fails