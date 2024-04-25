public class sqrtusingbinarysearch {
    static int sqrt(int x){
        int low = 0;
        int high = x/2;
        int mid,ans=0,sqr;
        while(low<=high){
            mid = (low+high)/2;
            sqr=mid*mid;
            if(sqr==x){
                return mid;
            }
            else if (sqr<=x) {
                low=mid+1;
                ans=mid;
            }
            else{
                high = mid-1;
            }
        }
        return ans;

    }
}

class MainFunction{
    public static void main(String args[]){
        int ans = sqrtusingbinarysearch.sqrt(100);
        System.out.println(ans);
    }
}