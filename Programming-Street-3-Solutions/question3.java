public class question3{
    public static void main(String args[])
    {
        int rows = 3;
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= rows/2 + 1 + i; j++)
            {
                for(int k = 1; k <= rows/2 + 1 -j; k++)
                {
                    System.out.print(" ");
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}