package day1;

public class Client {
	static void doCalc(byte... a) {
		System.out.println("byte...");
	}
	static void doCalc(long a, long b) {
		System.out.println("Long.Long");
	}
	static void doCalc(Byte s1, Byte s2) {
		System.out.println("Byte Byte");
	}
	public static void main(String[] args) {
		byte b=5;
		doCalc(b,b);
	}

}
/* options are:
* a)byte..
* b)Long.Long
* C)Byte Byte
* d)compilation error
* 
* CORRECT ANSWER- option b
*/