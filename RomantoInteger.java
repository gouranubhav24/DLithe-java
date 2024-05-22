import  java.util.*;
class RomantoInteger
{
    public static int romantoint(String s)
    {
        int total=0;
        int temp=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            char currentchar=s.charAt(i);
            int currentvalue=getintegervalue(currentchar);

            if(currentvalue < temp)
            {
                total-=currentvalue;
            }
            else 
            {
                total+=currentvalue;
            }
            temp=currentvalue;
        }
        return total;
    }
    public static int getintegervalue(char romanchar)
    {
        switch(romanchar)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sin = new Scanner(System.in);
        System.out.println("enter the roman number");
        String s = sin.next();
        System.out.print(romantoint(s));
    }

}