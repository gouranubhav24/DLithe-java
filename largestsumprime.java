import java.util.Scanner;
class largestsumprime
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
        System.out.print(largestprime(n,arr));


    }
    public static int largestprime(int n,int[] arr)
    {
        int sum=0;
        int[] result = new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                sum=arr[i]+arr[j];
                if(prime(sum))
                {
                    result[k] = sum;
                    k=k+1;
                }
            }
        }
        int max=result[0];
        for(int i=1;i<result.length;i++)
        {
            if(result[i]>max)
            {
                max=result[i];
            }
        }
        return max;
    }
    public static boolean prime(int num)
    {
        int flag=0;
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