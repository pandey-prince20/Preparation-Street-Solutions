
import java.util.*;
public class question3 {
    public static void main(String ars[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum = sum +(double) 1 / i;
        }
        System.out.println(sum);
       
    }
}
