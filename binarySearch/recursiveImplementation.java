/* time complexity :- O(logn)
auxiliary space:- O(logn) */
public class recursiveImplementation {
    public static void main(String [] args){
        int arr[]={1,3,5,7,9,11,13,15,17};
        int x=9;
        int low=0, high= arr.length-1;
        int result= bSearch(arr,low,high,x);
        if(result==-1)
            System.out.println("element not there");
        else
            System.out.println("element at index:"+result);
    }

    public static int bSearch(int [] arr,int low,int high,int x) {
        int mid=(low+(high-low))/2;
        if(low<=high) {
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                bSearch(arr, low, mid - 1, x);
            else
                bSearch(arr, mid + 1, high, x);
        }
        return -1;
    }
}
