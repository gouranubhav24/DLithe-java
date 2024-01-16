import java.util.Scanner;
public class Noteen
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the values for a,b,c");
        int a=sin.nextInt();
        int b=sin.nextInt();
        int c=sin.nextInt();
        int result = noteensum(a,b,c);
        System.out.println("The noteen sum of "+a+" "+b+" "+c+" is "+result);
        


    }
    public static int fixteen(int n)
    {
        if((n>=13 && n<=14)||(n>=17&&n<=19)){
            return 0;
        }
        else
        {
            return n;
        
        }
    }
    public static int noteensum(int a,int b,int c)
    {
        a=fixteen(a);
        b=fixteen(b);
        c=fixteen(c);
        return a+b+c;
    }
}