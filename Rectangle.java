import java.util.Scanner;
class Rectangle {
   int length;
   int breadth;
   public void calculate_area( int a,int b ) {
      length=a;
      breadth=b;
      int area = length * breadth;
      System.out.println("area of ractangle is : "+area);
   }
   public static void main(String []args) {
      int len,bre;
      Scanner sacn=new Scanner(System.in);
      System.out.println("enter the length : ");
      len = sacn.nextInt();
      System.out.println("enter the breadth : ");
      bre = sacn.nextInt();
      Rectangle obj = new Rectangle();
      obj.calculate_area(len,bre);
   }
}