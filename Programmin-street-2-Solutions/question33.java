public class question33{
    public static int fibb(int n)
    {
        if( n == 0 || n == 1)
        {
            return n;
        }
        return fibb(n-1) + fibb(n-2);
    }
    public static void main(String args[])
    {
        int n = 7;
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum = sum + fibb(i);
        }
        System.out.println(sum);

    }
}