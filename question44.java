public class question44{
    public static void main(String args[])
    {
        int rows = 3;
        int temp = 1;
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= rows; j++)
            {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}