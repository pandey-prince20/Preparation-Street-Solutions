import java.util.*;
public class question34{
    public static void printArr(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        printArr(arr);
        System.out.println();
        Arrays.sort(arr);
        printArr(arr);
        float median = 0;
        for(int i = 0; i < size; i++)
        {
            if( size % 2 == 0)
            {
               int  sum = arr[(size/2)-1] + arr[size/2];
                median =(float) sum / 2;
            }
            else{
                median = arr[size/2];
            }
        }
        System.out.println();
        System.out.println(median);
    }
}