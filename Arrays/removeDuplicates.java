/*from a sorted array. using auxiliary space*/
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        arr=removeDupes(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static int[] removeDupes(int [] arr){
        int n=arr.length,res=1;
        int [] temp= new int[n];
        temp[0]=arr[0];
        for(int i=1;i<n;i++){
            if(temp[res-1]!=arr[i]){
                temp[res]=arr[i];
                res++;
            }
            /*here res becomes the size of the new array and res-1 is the index, so if we start res=0 then res would be the index
            and if we start from res=1 then res is the size
             */
        }
        return temp;
    }
}
