public class question6{
    public static void main(String args[])
    {
        int arr[] = {12,24,36};
        int gcd = -1;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(smallest > arr[i])
            {
                smallest = arr[i];
            }
        }
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        for(int i = 2; i <= smallest; i++)
        {
            if( a % i == 0 && b % i == 0 && c % i == 0)
            {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

        
}