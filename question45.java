public class question45 {
    public static void main(String args[])
    {
        int rows = 4;
        char ch = 'A';
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j<= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
