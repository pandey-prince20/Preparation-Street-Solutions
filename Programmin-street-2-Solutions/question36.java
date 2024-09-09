public class question36{
    public static void main(String args[])
    {
        int n = 4;
        int count = 0;
        int num = 1;
        int sum = 0;
        while( count < n)
        {
           if(num % 2 == 0)
           {
              sum = sum + num;
              count++;
           }
           num++;
        }
        System.out.println(sum);
    }
}