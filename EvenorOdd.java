import java.util.Scanner;
public class EvenorOdd
{
	static void EvenorOdd(int num)
	{
	    switch (num&1)
	    {
	        case 0:System.out.println("Even number");
	                break;
	       case 1 :System.out.println("odd number");
	                break;
	    }
	}
	
	
	public static void main(String[] args) {
	    Scanner sin = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sin.nextInt();
		EvenorOdd(num);
		}
}
