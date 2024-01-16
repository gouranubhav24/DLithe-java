import java.util.Scanner;
public class Lottery
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the values for a,b,c");
        int a=sin.nextInt();
        int b=sin.nextInt();
        int c=sin.nextInt();
        int total = verification(a,b,c);
        System.out.println("The Lottery result is "+total);
    }
    public static int verification(int a,int b,int c)
    {
        if((a==b)&&(b==c))
        {
            return 20;
        }
        else if((a==b)||(a==c)||(b==c))
        {
            return 10;
        }
        else
        {
            return 0;
        }
    }
}