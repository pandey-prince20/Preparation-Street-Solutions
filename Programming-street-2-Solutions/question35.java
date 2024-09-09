public class question35{
    public static void main(String args[])
    {
        int rows = 4;
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= rows; j++)
            {
                if( j <= i)
                {
                   System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}