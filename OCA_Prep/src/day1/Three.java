package day1;

class Three {
	String s="Three";
}
class Small extends Three {
	String s="Small";
	public Small() {
		System.out.println("S");
	}
	{
	System.out.println(super.s);
	
}
}
class C extends Small{
	String s="C Class";
	public C() {
		System.out.println("C");
		
	}
	{
		System.out.println(super.s);
	}
}
public class MClass { //class MClass is public, should be declared in a file named MClass.java
	public static void main(String[] args) {
		C cc=new C();
		System.out.println(cc.s);
	}
}
//compile time error: CORRECT ANSWER