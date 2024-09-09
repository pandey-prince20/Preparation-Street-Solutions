import java.util.*;
public class question19{
    public static void main(String args[])
    {
        int start = 1;
        int end = 10;
        for(int i = start; i <= end; i++)
        {
            float  x = (float)Math.sqrt(i);
            if(x == (int)x)
            {
                System.out.println(i);
            }
        }
    }
}