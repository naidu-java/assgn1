import java.util.Scanner;
class Complex {
   int real;
   int imaginary;
   public void Display( int a,int b ) {
      real=a;
      imaginary=b;
      System.out.println("complex number is : "+real+"+"+imaginary+"i");
   }
   public static void main(String []args) {
      int r,i;
      Scanner sacn=new Scanner(System.in);
      System.out.println("enter the real part : ");
      r = sacn.nextInt();
      System.out.println("enter the imaginary part : ");
      i = sacn.nextInt();
      Complex obj = new Complex();
      obj.Display(r,i);
   }
}