package day1;

public class MultipleReturn {
	int getInt() {
		int returnval=10;
		try {
			String[] students= {"Harry","Paul"};
			System.out.println(students[5]);//ArrayIndexOutOfBound exception
		}
		catch(Exception e) {
			System.out.println("About to return"+ returnval);//prints About to return 10
			return returnval;
		}
		finally {
			returnval+=10;
			System.out.println("Now return value is"+ returnval);// finally block will run whether exception occurs or not
		}// prints now return value is 20
		return returnval;
	}
	public static void main(String[] args) {
		MultipleReturn mr=new MultipleReturn();
		System.out.println("In main"+mr.getInt());// prints In main 10
	}

}
//OUTPUT:-
//About to return10
//Now return value is20
//In main10
