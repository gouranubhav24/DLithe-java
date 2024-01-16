import java.util.Scanner;
public class Sum
{
     public static int check_variable(int a,int b,int c)
    {
        int sum=0;
        if(a==13)
        {
            sum=0;
        }
        else if(b==13)
        {
            sum=sum+a;
        }
        else if(c==13)
        {
            sum=sum+a+b;
        }
        else 
        {
            sum=sum+a+b+c;
        }
     return sum;
    }
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        int result = 0;
        System.out.println("Enter the values of a,b,c");
        int a = sin.nextInt();
        int b = sin.nextInt();
        int c = sin.nextInt();
        result=check_variable(a,b,c);
        System.out.print("The sum is "+result);
    }
   
   
}