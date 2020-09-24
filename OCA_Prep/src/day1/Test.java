package day1;

public class Test {
	public static void main(String[] args) {
//		int if=10;        //line1
		//Syntax error on token "if", invalid VariableDeclaratorId
		

		int String=123;//line2
//		System.out.println(if++);     //line3
		//Syntax error on token "if", invalid Expression
		System.out.println(++String);//line4
	}
}
//if line1 and line 3 is removed then code will compile