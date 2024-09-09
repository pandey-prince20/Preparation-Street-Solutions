

public class question47 {
    public static void main(String args[])
    {
        int arr[] = {-1, 0, 1, 2, -1, -4};
       for(int i  = arr.length-1; i >0; i++)
       {
           int sum = arr[i] + arr[i-1] + arr[i-2];
           if( sum == 0)
           {
            System.out.println("[ " + arr[i-2] +", "+ arr[i-1] + ", " + arr[i] + " ]");
           }
       }
    }
    
}
