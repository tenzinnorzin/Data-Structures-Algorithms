import java.util.Scanner;

public class SelectionSort {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        arr = selectSort(arr,n);
        System.out.println("the sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }

    static int [] selectSort(int [] arr,int n)
    {
        int temp;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n-1;j++){
                if(arr[j+1]<arr[min]){
                    min=j+1;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

}
