package Sesi4;

public class Super_keyword{
    //override method
    public void myMethod()
    {
     System.out.println("Overridden method");
    }	   
 }
 class hasil extends Super_keyword{
    public void myMethod(){
     //This will call the myMethod() of parent class
     super.myMethod();
     System.out.println("Overriding method");
    }
    public static void main( String args[]) {
     hasil test = new hasil();
     test.myMethod();
    }
 }