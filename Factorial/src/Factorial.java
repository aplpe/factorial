import java.util.Scanner;

public class Factorial {

	public static int f_Factorial(int a){
		
		if (a == 1)
			return 1;
		else
			return a * f_Factorial(a-1);
	}
		
	public static void main(String[] args) {
		int n;
System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
     
      n = in.nextInt();
     
      if (n < 0)
         System.out.println("Number should be non-negative.");
      else
      {
		int result = f_Factorial(n);
		System.out.printf(" factorial of number %d is %d.\n",n, result);
      
	}
}
}

