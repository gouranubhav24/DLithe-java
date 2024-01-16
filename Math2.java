import java.util.Scanner;
class Math2
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        double a,b,res,c,d;
        a = sin.nextDouble();
        b = sin.nextDouble();
        res = Math.pow(Math.min(a,b),Math.max(a,b));
        System.out.print(res);
    }
}