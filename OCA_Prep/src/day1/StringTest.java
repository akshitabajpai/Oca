package day1;

public class StringTest {
	public static void main(String[] args) {
		String s1="Abc";
		String s2=s1.toLowerCase();
		String s3="abc";
		
		System.out.println(s1==s2);//line1
		System.out.println(s1.equals(s2));//line2
		System.out.println(s2==s3);//line3
		System.out.println(s3.equals(s2));//line4
		System.out.println(s1==s3);//line5
		System.out.println(s3.equalsIgnoreCase(s1));//line6
	}

}
//OUTPUT:
/* false
*false
*false
*true
*false
*true
*/