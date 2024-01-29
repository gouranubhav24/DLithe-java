import java.util.Scanner;
public class check_last_digit
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sin.nextInt();
        System.out.println("Enter the second number");
        int num2 = sin.nextInt();
        System.out.print(lastDigit(num1,num2));

    }
    public static boolean lastDigit(int num1,int num2)
    {
        int last1= num1 % 10;
        int last2 = num2 % 10;
        return last1 == last2;
        
}
}
