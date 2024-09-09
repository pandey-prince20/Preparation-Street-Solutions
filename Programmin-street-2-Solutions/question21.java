public class question21{
    public static void main(String args[])
    {
        int arr[] = {12, 13, 1, 10, 34, 1};
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
        for(int i = 0; i < arr.length; i++)
        {
            if( arr[i] < secSmallest)
            {
                if( arr[i] != smallest)
                {
                    secSmallest = arr[i];
                }
                
            }
        }
        System.out.println(secSmallest);
    }
}