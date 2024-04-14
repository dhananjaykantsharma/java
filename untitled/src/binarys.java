import java.util.*;

public class binarys{
    static void binarySearch(int[] arr,int high,int find){
        int low=0,mid;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid]==find){
                System.out.println("element is present at "+mid+" index");
                break;
            }
            else if (arr[mid]>find) {
                high=mid;
            }
            else low=mid;
        }
    }

    public static void main(String []args){
        int a[] = new int[]{5,8,13,19,22,26};

        System.out.println("enter the element you want to search for");
        Scanner obj = new Scanner(System.in);

        int value = Integer.parseInt(obj.next());

        int low=0,high=5,mid;

        while((low<=high) && (low == high-1)){
            mid=(low+high)/2;

            if(a[mid]==value){
                System.out.println("lower bound of "+value+" is "+a[mid]+" at index "+mid);
                System.out.println("upper bound of "+value+" is "+a[mid+1]+" at index "+(mid+1));
                break;
            }
            else if(a[mid] > value){

                high=mid;
            }
            else{
                low=mid;
            }

        }

        if(a[high]==value){
            System.out.println("lower bound of "+value+" is "+a[high]+" at index "+high);
            System.out.println("upper bound of "+value+" does not exist");
        }
        else{
            System.out.println("lower bound of "+value+" is "+a[low]+" at index "+low);
            System.out.println("upper bound of "+value+" is "+a[low+1]+" at index "+(low+1));
        }


    }

}
