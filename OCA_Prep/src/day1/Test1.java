package day1;

public class Test1 {
	public static void main(String[] args) {
		Test1 ts=new Test1();
		System.out.print(isAvailable+" ");
		isAvailable=ts.doStuff();
		System.out.println(isAvailable);
	}
	 public static boolean doStuff() {// if  public static not put before method then it will not make any difference, output is same.
		return !isAvailable;
	}
	 static boolean isAvailable=false;// if isAvailable is not static then it will not make a reference with the main method.
	

}
//output:-
//false true
