/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
