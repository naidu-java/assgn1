import java.util.Scanner;
class Secondlarge {
    public static void main(String[] args) {
        int second = 0;
        int first = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array values: ");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (first < arr[i]) {
                second = first;
                first = arr[i];
            }
            if (second < arr[i] && first != arr[i])
                second = arr[i];
        }
        System.out.println("Second Largest number is: " + second);
    }
}