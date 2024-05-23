import java.util.*;
class bricks
{
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("2 types ");
        System.out.println("enter the number of 5 inches brick available");
        int five = sin.nextInt();
        System.out.println("enter the number of 2 inches brick available");
        int two = sin.nextInt();
        System.out.println("enter the size of the wall to be built in inches");
        int wall = sin.nextInt();
        System.out.print(possibleornot(five,two,wall));

    }
    public static boolean possibleornot(int five,int two,int wall)
    {
        int lb = Math.abs(wall/5);
        int min = Math.min(lb,five);
        int total = 5*min;
        int sb = wall - (5*min);
        if(sb < 2*two)
        {
            int i=0;
            while(i<two)
            {
                total = total +2;
                if(total==wall)
                {
                    return true;
                }
                i+=1;
            }
        }
        return false;


    }
}