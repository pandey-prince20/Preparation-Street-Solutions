public class question36 {
    public static void main(String args[])
    {
        int rows = 3;
        boolean b = true;
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= rows; j++)
            {
                if( b == true)
                {
                    System.out.print("X");
                    b  = false;
                }
                else
                {
                    System.out.print("O");
                    b = true;
                }
            }
            
            System.out.println();
        }
    }
}
