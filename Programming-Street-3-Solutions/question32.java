public class question32{
    public static void main(String args[])
    {
        int rows = 5;
        for(int i = 1; i <= rows; i++)
        {
            if( i == rows/2 + 1)
            {
                for(int j = 1; j <= rows; j++)
                {
                    System.out.print(" * ");
                }
            }
            else
            {
                System.out.print("   ");
            }
        }
    }
}