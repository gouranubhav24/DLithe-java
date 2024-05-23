import java.util.Scanner;
class maxvowel
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
        int maxvowel=0;
        int index=0;
        for(int i=0;i<n;i++)
        {
            int temp =checkvowel(arr[i]);
            if(maxvowel < temp)
            {
                maxvowel=temp;
                index=i;
            }
        }
        System.out.println("the string with max number of vowels is "+arr[index]);

    }
    public static int checkvowel(String s)
    {
        char temp = ' ';
        int vowel=0;
        for(int i=0;i<s.length();i++)
        {
            temp = Character.toLowerCase(s.charAt(i));
            if(temp == 'a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
            {
                vowel+=1;
            }
        }
        return vowel;
    }
}