public class question41 {
    public static void main(String args[])
    {
        int matrix[][] = new int[3][3];
        int temp = 1;
        for(int j = 0; j < matrix[0].length; j++)
        {
            matrix[0][j] = temp;
            temp++;
        }
        for(int j = matrix[0].length -1; j >= 0; j--)
        {
            matrix[1][j] = temp;
            temp++;
        }
        for(int j = 0; j < matrix[0].length; j++)
        {
            matrix[2][j] = temp;
            temp++;
        }
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
