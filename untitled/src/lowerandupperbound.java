public class lowerandupperbound {
    public static void main(String args[]){
        int arr[]= new int[]{2,4,5,8,10,12,13,19};
        int k=19;

        int low =0;
        int high = arr.length;
        int mid;
        while(low < high){
            mid = low + (high- low)/2;
            if(k <= arr[mid]){
                high=mid;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("upper bound is " +arr[low]);
    }
}
