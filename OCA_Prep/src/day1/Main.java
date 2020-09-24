package day1;


class Base {
	public static void show() {
		System.out.println("Base class Called");
	}
}
class Derived extends Base {
	public static void show() {
		System.out.println("Derived class Called");
	}
}
public class Main {

	public static void main(String[] args) {
		Base b=new Derived();
		Base b1=new Base();
		Derived b2=new Derived();
//		Derived b3=new Base();//----- cannot convert from Base to Derived 
		b.show();
		b1.show();
		b2.show();
//		b3.show();
		// TODO Auto-generated method stub

	}

}
