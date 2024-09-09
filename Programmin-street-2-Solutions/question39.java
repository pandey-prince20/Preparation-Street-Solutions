
public class question39{
    public static void main(String args[])
    {
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};
        if( arr1.length == arr2.length)
        {
            for(int i = 0; i < arr1.length; i++)
            {
                for(int j = 0; j < arr1.length; j++)
                {
                    if( arr1[i] == arr2[j])
                    {
                        System.out.println(arr1[i]+" ");
                    }
                }
            }
        }
        else
        {
            int size = Math.max(arr1.length, arr2.length);
            if( size == arr1.length)
            {
                for(int i = 0; i < size; i++)
                {
                    for(int j = 0; j < arr2.length; j++)
                    {
                        if( arr1[i] == arr2[j])
                        {
                            System.out.println(arr1[i]);
                        }
                    }
                }
            }
            else if( arr2.length == size)
            {
                for(int i = 0; i < size; i++)
                {
                    for(int j = 0; j < arr1.length; j++)
                    {
                        if( arr2[i] ==arr1[j])
                        {
                            System.out.println(arr2[i]);
                        }
                    }
                }
            }
        }
    }
}