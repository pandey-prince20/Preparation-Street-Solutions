import java.util.*;
public class question9{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if( i % 2 != 0)
            {
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    }
}