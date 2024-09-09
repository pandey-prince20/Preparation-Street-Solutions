public class question9{
    public static void main(String args[])
    {
        int rows = 4;
        int temp = 1;
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}