package day1;

interface MyInterface {
	public int a=20;
	abstract public void set();
	abstract public void get();

}
public class Myclass implements MyInterface {
	public void set() {
		a=90;//The final field MyInterface.a cannot be assigned
	}
	public void get() {
		System.out.println("a="+a);
	}
	public static void main(String[] args) {
		Myclass m=new Myclass();
		m.set();
		m.get();
	}
}

