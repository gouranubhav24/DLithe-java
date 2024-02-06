import java.util.Scanner;
public class ArrayAddition
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter the size of both array a and b");
        int na = sin.nextInt();
        int nb = sin.nextInt();
        int a[] = new int[na];
        int b[] = new int[nb];
       System.out.println("enter the values");
        for(int i=0;i<na;i++)
        {
            a[i] = sin.nextInt();
        }
        for(int i=0;i<nb;i++)
        {
            b[i] = sin.nextInt();
        }
        System.out.println("The first array elements are");
        PrintElements(a);
        System.out.println("The second array elements are");
        PrintElements(b);
        System.out.println("The resultant array is");
        PrintElements(addarray(a,b));
    }
    public static void PrintElements(int x[])
    {
        for(int i:x)
        {
            System.out.print(i+" ");
        }
    }
    public static int[] addarray(int x[],int y[])
    {
        int c[] = new int[x.length];
        for(int i=0;i<x.length;i++)
        {
            c[i] = x[i]+y[i];
        }
        return c;
    }
}