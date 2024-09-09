public class question14{
    public static void main(String args[])
    {
        int rows = 3;
        int temp = 0;
        for(int i = 1; i<= rows; i++)
        {
            for(int j = 1; j<=i+temp; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            temp = temp + i;
        }
    }
}