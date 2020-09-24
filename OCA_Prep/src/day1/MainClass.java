package day1;

class Flower {
	public Flower() {
		this(100);
		System.out.println("flower default contructor");
	}
	public Flower(int i) {
		System.out.println("flower contructor"+i);
	}

}
class Rose extends Flower {
	public Rose() {
		System.out.println("rose contructor 1");
	}
	public Rose(int i) {
		this();
		System.out.println("rose contructor"+i);
	}
}

public class MainClass {
	public static void main(String[] args) {
		Rose r=new Rose();
	}
}
//OUTPUT
//flower contructor100
//flower default contructor
//rose contructor 1
