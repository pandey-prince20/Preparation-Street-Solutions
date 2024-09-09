public class question29{
    public static void main(String args[])
    {
        int a = 6;
        int b  = 10;
        for(int i = 1; i < a * b; i++)
        {
            if( (a * b) % i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}