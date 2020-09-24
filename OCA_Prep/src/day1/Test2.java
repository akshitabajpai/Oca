package day1;

public class Test2 {
	public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
  
    public static void main(String args[]) 
    { 
        gfg(null); 
    } 
//	 public static void main(String[] args) throws ArithmeticException {
//		 int x = 10;
//		 int y = 2;
//		 try {
//		 for (int z = 2; z >= 0; z--) {
//		 int ans = x / z;
//		System.out.print(ans+ " ");
//		 }
//		 } catch (Exception e1) {
//		 System.out.println("E1");
//		 }
//		 }

}
