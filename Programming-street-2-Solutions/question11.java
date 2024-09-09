
public class question11 {
    public static boolean isPrime(int n)
    {
        if( n == 1)
        {
            return false;
        }
        if( n == 2)
        {
            return true;
        }
        for(int i = 2; i < n; i++)
        {
            if( n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n = 28;
        int curr = Integer.MIN_VALUE;
        int prvs = Integer.MIN_VALUE;
        for(int i = 1; i <= 28; i++)
        {
            if( n % i == 0 && isPrime(i))
            {
                curr = i;
                if( curr < prvs)
                {
                    curr = prvs;
                }
                prvs = curr;
            }
        }
        System.out.println(curr);
    }
    
}
