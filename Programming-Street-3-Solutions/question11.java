public class question11{
    public static void main(String args[])
    {
        int rows = 4;
        boolean b = true;
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= rows; j++)
            {
                if( b == true)
                {
                    System.out.print("1 ");
                    b = false;
                }
                else{
                    System.out.print("0 ");
                    b = true;
                }

            }
            if( b== true)
            {
                b = false;
            }
            else
            {
                b = true;
            }
            System.out.println();
        }
    }
}