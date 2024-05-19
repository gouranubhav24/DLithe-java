import java.util.Scanner;
class spclcharacters
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        System.out.println("enter the character elements of the array");
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
        {

            String word= in.next();
            arr[i]=word;
        }
        for(int i=0;i<n;i++)
        {
            char temp=' ';
            for(int j=0;j<arr[i].length();j++)
            {
                temp=arr[i].charAt(j);
                if(!splchar(temp))
                {
                    System.out.print(temp);
                }
            }
        }
        

    }
    public static boolean splchar(char ch)
    {
        if(Character.isDigit(ch))
        {
            return true;
        }
        else if(Character.isWhitespace(ch))
        {
            return true;
        }
        else if(Character.isUpperCase(ch))
        {
            return true;
        }
        else if(Character.isLowerCase(ch))
        {
            return true;
        }
        return false;
    }

}