public class question17 {
    public static void main(String args[])
    {
        int rows = 3;
        for(int i = 1; i <= rows; i++)
        {
           for(int j = rows -i; j > 0; j--)
           {
            System.out.print(" ");
           }
           for(int j = 2* i -1; j > 0; j--)
           {
            System.out.print("*");
           }
           System.out.println();
        }
    }
    
}
