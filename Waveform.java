import java.util.Scanner;
class WaveForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array values: ");
        int arr[] = new int[10];
        for (int i=0;i<arr.length;i++)
        {
             arr[i] = scan.nextInt();
         }
        for (int i = 0; i < arr.length; i++) {
            if ((i%2)==0) 
            {
                  arr[i]=arr[i]+arr[i+1];
	  arr[i+1]=arr[i]-arr[i+1];
	  arr[i]=arr[i]-arr[i+1];
            }
        }
        for (int i=0;i<arr.length;i++)
        {
	  System.out.println(arr[i]);
         } 
    }
}