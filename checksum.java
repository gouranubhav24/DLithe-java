import java.util.Scanner;
public class checksum
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sin.nextInt();
        System.out.println("Enter the second number");
        int num2 = sin.nextInt();
        System.out.print(sumDouble(num1,num2));

    }
    public static int sumDouble(int num1,int num2)
    {
        if (num1 == num2)
        {
            return ((num1+num2)*2);
        }
        else
        {
            return  (num1+num2);
        }
        
}
}
