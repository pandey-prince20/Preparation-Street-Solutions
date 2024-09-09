public class question37{
    public static void main(String args[])
    {
        int num = 54321;
        int val = 3;
        int count = 0;
        while( num > 0)
        {
            int lastDigit = num % 10;
            if( lastDigit > val)
            {
                count++;
            }
             num = num / 10;
        }
        System.out.println(count);
    }
}