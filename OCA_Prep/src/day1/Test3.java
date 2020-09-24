package day1;

public class Test3 {
	public static void print(String s) 
    {     
        System.out.println("It is a String"); 
    } 
    public static void print(Object o) 
    { 
        System.out.println("It is an Object"); 
    } 
  
    public static void main(String args[]) 
    { 
        print(-45);
        print(0);
        print("45");
        print("abcd");
        print(null);
        
    } 

}
//OUTPUT:
//It is an Object
//It is an Object
//It is a String
//It is a String
//It is a String
