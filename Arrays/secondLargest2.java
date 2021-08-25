/* in one traversal*/
import java.util.Scanner;

public class secondLargest2 {
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
        int largest=0, res=-1;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            if (arr[i] < arr[largest]) {
                if (res==-1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        if(res==-1){
            System.out.println("no second largest element");
        }
        else
            System.out.println("second largest element is:"+arr[res]);
    }
}
