import java.util.*;
class matrix
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows for matrix");
        int m = in.nextInt();
        System.out.println("enter the number of columns for matrix");
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("enter the elements for the matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }
        if(matrix == null || matrix.length==0)
        {
            return;
        }
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(row[i]==1||col[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        

        
    }
    
}