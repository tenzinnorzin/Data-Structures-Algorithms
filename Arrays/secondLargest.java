/* one traversal */
public class secondLargest {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        sLarge(arr);
    }
    public static void sLarge(int [] arr){
        int max=largest(arr);
        int res=0,flag=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[max]) {
                if (arr[res] < arr[i])
                    res=i;
                flag=1;
            }
        }
        if(flag==0) System.out.println("No second largest element");
        else
            System.out.println("second largest element is:"+ arr[res]);

    }
    public static int largest(int arr[]){
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[max]<arr[i]) max=i;
        }
        return max;
    }
}
