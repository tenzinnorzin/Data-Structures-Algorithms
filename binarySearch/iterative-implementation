public class iterationImplementation {
    public static void main(String [] args){
        int arr[]={1,3,5,7,9,11,13,15};
        int x=16;
        int result=bSearch(arr,x);
        if(result==-1)
            System.out.println("the element is not present");
        else
            System.out.println("the element is at index: "+result);
    }
    public static int bSearch(int [] arr, int x){
        int low=0, high= arr.length - 1;
        while(low<=high){
            int mid=( low+high )/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) high= mid-1;
            else low= mid+1;
        }
        return -1;

    }
}
