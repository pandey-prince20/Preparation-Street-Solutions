
import java.util.*;
public class question2 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       boolean isPrime = true;
       for(int i = 2;i < n; i++)
       {
        if( n % i == 0)
        {
            isPrime = false;
            break;
        }
       }
       if(isPrime == true)
       {
        System.out.println("prime");
       }
       else{
        System.out.println("not prime");
       }
    }
    
}
