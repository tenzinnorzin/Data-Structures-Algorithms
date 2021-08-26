/* from a sorted array, no extra space */
import java.util.Scanner;

public class removeDuplicates2 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        removeDupes(arr);

    }
    public static void removeDupes(int [] arr){
        int n=arr.length,res=1;
        int [] temp= new int[n];
        for(int i=1;i<n;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }
            /* here res becomes the size of the new array and res-1 is the index, so if we start res=0 then res would be the index
            and if we start from res=1 then res is the size */
        }
        System.out.println("New array: ");
         for(int i=0; i<res; i++){
             System.out.println(arr[i]);
         }
    }
}
