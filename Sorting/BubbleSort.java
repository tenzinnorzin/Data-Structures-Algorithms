package Sorting;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        arr = bubbleSort(arr,n);
        System.out.println("the sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static int [] bubbleSort(int [] arr,int n){
        int temp;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if (arr[j + 1] < arr[j]){
                    temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(swapped==false) break;
        }
        return arr;
    }
}
