import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = insertSort(arr, n);
        System.out.println("the sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    static int[] insertSort(int[] arr, int n) {
        for(int i=1;i<n;i++){
            int key= arr[i];
            int j= i-1;
            while((j>-1) && (key < arr[j])){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
