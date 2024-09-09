public class question24{
    public static boolean isPallindrome(int n)
    {
        int temp = n;
        int sum = 0;
        while( n > 0)
        {
            int lastDigit = n % 10;
            sum = sum*10 + lastDigit;
            n = n / 10;
        }
        return temp==sum;
    }
    public static void main(String args[])
    {
        int start = 1;
        int end = 100;
        for(int i = start; i <= end; i++)
        {
            if(isPallindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}