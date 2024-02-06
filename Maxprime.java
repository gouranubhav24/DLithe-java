import java.util.Scanner;
public class Maxprime
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        
        System.out.println("Enter the size of the array");
        int n = sin.nextInt();
        int a[] = new int[n];
        System.out.println("enter the values in the array");
        for(int i=0;i<n;i++)
        {
            a[i] = sin.nextInt();
        }
        
        int prime[] = new int[n];
        for(int i=0,j=0;i<n;i++,j++)
        {
            if(prime(a[i]))
            prime[j] = a[i];
        }
        int largest_prime = maximumnumber(prime);
        System.out.println("The largest prime number is "+largest_prime);
        System.out.println("The second largest number is "+maximumnumber(prime-largest_prime))
    }
    
    
    public static int maximumnumber(int z[])
    {
        int maximum = z[0];
        for(int i=1;i<z.length;i++)
        {
            if(z[i] > maximum)
            {
                maximum = z[i];
            }
        }
        return maximum;
    }
    
    public static boolean prime(int num)
    {
        int i=2;
        int counter=0;
        if(num ==1)
        {
            return false;
        }
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
}