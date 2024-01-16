import java.util.Scanner;
public class vacation
{
    public static void main(String args[])
    {
        boolean day = false,vaca=true,r;
        r=sleepIn(day,vaca);
        System.out.print(r);
    }

   
public static boolean sleepIn(boolean day,boolean vaca)
{
  return !day||vaca;
}
}