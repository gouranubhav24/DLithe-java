
import java.util.Scanner;
public class Math1
{
	public static void main(String[] args) {
	    double a,b;
	    Scanner sin = new Scanner(System.in);
	    a = sin.nextDouble();
	    b = sin.nextDouble();
	    double eqn = (Math.log(a) + Math.log(b)+ Math.exp(a))/(Math.pow(a,b)+Math.cbrt(b)+Math.tan(a));
	    System.out.print(eqn);
	}
}
