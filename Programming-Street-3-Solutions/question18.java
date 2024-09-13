public class question18{
    public static void main(String args[])
    {
        int rows = 4;
        for(int i = 1; i <= rows; i++)
        {
            if(i != 1 && i != rows)
            {
                System.out.print(1);
                for(int j = 1; j <= rows-2; j++)
                {
                    System.out.print(" ");
                }
                System.out.print(1);
            }
            else
            {
                for(int j = 1; j <= rows; j++)
                {
                    System.out.print(j);

                }
            }
            System.out.println();
        }
    }
}