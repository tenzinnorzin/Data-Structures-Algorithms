import java.util.Scanner;
public class deletion{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x;
        System.out.println("enter size of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the index at which you want deletion: ");
        x= sc.nextInt();
        arr = insert(arr,x);
        System.out.println("new array:");
        for(int i=0; i< n-1 ;i++){
            System.out.println(arr[i]);
        }
    }

    public static int [] insert(int [] arr, int x){
        int n= arr.length;
        for(int i=x;i<n-1;i++) {
            arr[i] = arr[i+1];
        }
        return arr;
    }

}
