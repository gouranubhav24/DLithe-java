import java.util.Scanner;
public class checkeven
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sin.nextInt();
        System.out.print(Even(num));
        
    }
    public static boolean Even(int num)
    {
        if (num % 2==0)
        {
            return true;
        }
        else
            return false;
    }
    
}