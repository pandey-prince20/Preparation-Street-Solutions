public class question19 {
    public static void main(String args[])
    {
        int rows = 4;
        char ch = 'D';
        for(int i = 1; i <= rows; i++)
        {
            for(int j = rows; j >= i; j--)
            {
                System.out.print(ch+" ");
                
            }
            System.out.println();
            ch--;
        }
    }
}
