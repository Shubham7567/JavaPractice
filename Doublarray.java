public class Doublarray
{
    public static void main(String[] args)
    {
        int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int arr2[][][] = {{{1,-2,3},{2,3,4},{4,5,6}},{{4,5,6},{12,22,3},{3,3,4}},{{4,5,6},{12,22,3},{3,3,4}}};

        for(int i =0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    System.out.print(arr2[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}