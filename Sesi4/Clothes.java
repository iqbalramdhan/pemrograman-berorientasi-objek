//contoh kasus Clothes
package Sesi4;

public class Clothes{
    //Override method
    public void style()
    {
       System.out.println("Style Sweater");
    }
 }
 
 class Sweater extends Clothes{
    //Override method
    public void style(){
       System.out.println("Dono, style sweater is modern");
    }
    public static void main( String args[]) {
       Sweater hasil = new Sweater();
       //This will call the child class version of style()
       hasil.style();
    }
 }