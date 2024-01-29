import java.util.Scanner;
public class check_for_10
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sin.nextInt();
        System.out.println("Enter the second number");
        int num2 = sin.nextInt();
        System.out.print(makes10(num1,num2));

    }
    public static boolean makes10(int num1,int num2)
    {
        if (num1 == 10|| num2 == 10)
        {
            return true;
        }
        else if(num1 + num2 == 10)
        {
            return true;
        }
        else
        {
            return false;
        }
}
}
