import java.util.Scanner;
public class check_for_10_20
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sin.nextInt();
        System.out.println("Enter the second number");
        int num2 = sin.nextInt();
        System.out.print(in10_20(num1,num2));

    }
    public static boolean in10_20(int num1,int num2)
    {
        if ((num1 >=10 && num1 <=20)|(num2 >=10 && num2 <= 20 ))
        {
            return true;
        }
        else
        {
            return false;
        }
}
}
