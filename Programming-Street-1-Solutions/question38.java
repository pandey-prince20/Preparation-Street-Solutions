import java.util.*;
public class question38{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int sum = 0;
        while( n > 0)
        {
            int lastDigit = n % 10;
            sum = sum + lastDigit * lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}