import java.util.*;
public class question23{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int temp = a * b;
        
        while(temp > 0)
        {
            count++;
            temp = temp / 10;

        }
        System.out.println(count);
    }
}