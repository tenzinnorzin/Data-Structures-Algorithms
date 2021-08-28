import java.util.Scanner;
public class FactorialRecursive
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int fact=factorial(num);
		System.out.println(num+"! is: "+fact);
		
	}
	static int factorial(int num){
	    if(num==1 || num ==0)  return 1;
	    return num*factorial(num-1);
	}
}
