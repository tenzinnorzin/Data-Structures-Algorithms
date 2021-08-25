/*O(n) time complexity*/

public class insertion {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x, pos;
        System.out.println("enter size of array: ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter number you want to insert: ");
        x= sc.nextInt();
        System.out.println("enter the position you want to insert at: ");
        pos= sc.nextInt();
        arr = insert(arr,x,pos);
        System.out.println("new array:");
        for(int i=0;i< n;i++){
            System.out.println(arr[i]);
        }
    }

    public static int [] insert(int [] arr, int x,int pos){
        int index= pos-1;
        int n= arr.length;
        for(int i= n-1;i>index;i--) {
            arr[i] = arr[i - 1];
        }
        arr[index]=x;
        return arr;
    }
}
