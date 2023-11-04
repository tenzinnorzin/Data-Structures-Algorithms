import java.util.Scanner;

public class reverseArray {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        arr= reverse(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static int[] reverse(int arr []){
        int temp;
        int n=arr.length;
        for(int i=0;i<(n-i-1);i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr;
    }
    //Another way
    public static int[] reverse2(int arr[]){
        int high= arr.length-1;
        int low=0;
        while(low<high){
            //swap
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
        return arr;
    }
}
