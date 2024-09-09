public class question49{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if( arr[i] % 2 == 0)
            {
                sumEven = sumEven + arr[i];
            }
            else{
                sumOdd = sumOdd + arr[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
        int diff = Math.abs((sumEven - sumOdd));
        System.out.println(diff);

    }
}