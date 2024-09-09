public class question30{
    public static void main(String args[])
    {
        int arr[] = {1, 1, 0, 1, 1, 1};
        int count = 0;
        for(int i = 1; i <= arr.length-1; i++)
        {
            if( arr[i-1] == 0 && arr[i] == 0)
            {
               count++;
            }


        }
        System.out.println(count);
    }
}