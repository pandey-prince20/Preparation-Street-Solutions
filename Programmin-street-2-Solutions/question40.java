
public class question40{
    public static void main(String args[])
    {
        int n = 10;
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if( i % 2 == 0)
            {
                sum = sum + (int)Math.pow(i,2);
            }
        }
        System.out.println(sum);
    }
}