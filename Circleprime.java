import java.util.Scanner;
public class Circleprime
{
    public static boolean prime(int num)
    {
        int i=2;
        int counter=0;
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                counter = counter+1;
            }
        }
        if (counter>0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = sin.nextInt();
        int length = String.valueOf(number).length();
        int temp=0;
        for(int i=0;i<length;i++)
        {
        if (prime(number))
        {
            System.out.println(number+" is a prime  ");
            temp = number % 10;
            String s = String.valueOf(temp);
            String num = s+(number/10);
            number = Integer.valueOf(num);   
        }
        else{
            System.out.println(number+" is not a prime  ");
            temp = number % 10;
            String s = String.valueOf(temp);
            String num = s+(number/10);
            number = Integer.valueOf(num);
        }
        }
        
    }
}
