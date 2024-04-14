import java.util.*;

public class binarysearch {
    public static void main(String []args){

        System.out.println("Enter the number of element you want to enter in array");
        Scanner num = new Scanner(System.in);
        int n = Integer.parseInt(num.next());
        int[] arr = new int[n];
        System.out.println("enter element ");

        Scanner ele = new Scanner(System.in);

        for(int i=0;i < n; i++) arr[i] = Integer.parseInt(ele.next());

        for(int i=0;i < n;i++)  System.out.println(arr[i]);

        System.out.println("enter the element you want to search");

        int low=0, mid;
        int high = n;

        Scanner obj = new Scanner(System.in);
        int find = Integer.parseInt(obj.next());

       binarys.binarySearch(arr,high,find);

    }
}
