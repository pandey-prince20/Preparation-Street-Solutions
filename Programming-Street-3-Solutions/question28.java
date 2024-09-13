public class question28 {
    public static void main(String args[])
    {
        int rows = 4;
        char ch = 'A';
        for(int i = 1; i <= rows; i++)
        {
            System.out.print(ch);
            for(int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }
            if( i != 1)
            {
                System.out.print(ch);
                ch++;
            }
            else
            {
                ch++;
            }
            System.out.println();
        }
    }
}
