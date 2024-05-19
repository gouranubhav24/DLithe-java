import java.util.Scanner;
class reverseprime
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        System.out.println("enter the elements of the array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(prime(arr[i]))
            {
                if(prime(reverse(arr[i])))
                {
                    System.out.print(arr[i]+" ");
                }
            }
            
        }


    }
    public static int reverse(int num)
    {
        int temp=0,rem=0;
        while(num>0)
        {
            rem=num%10;
            temp=temp*10 + rem;
            num = num/10;
        }
        return temp;

    }
    public static boolean prime(int num)
    {
        int flag=0;
        if(num==1)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=flag+1;
            }
        }
        if(flag>0)
        {
            return false;
        }
        return true;

    }
}