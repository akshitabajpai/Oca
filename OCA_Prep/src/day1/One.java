package day1;

public class One {
	private double marks1,marks2,marks3;//instance variable
	private double maxmarks=100; //instance variable
	public double getAverage() {
		double avg=0;  //local variable
		avg=(marks1+marks2+marks3)/(maxmarks*3)*100;
		return avg;
	}
	public double setAverage(double val) { 
		avg=val;// compilation error will generate bcz "avg" is not accessible outside getAverage() method.
		
		
	}

}
