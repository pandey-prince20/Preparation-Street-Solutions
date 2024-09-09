public class question20 {
    public static void main(String args[])
    {
        int rows = 5;
        for(int i = 1; i <= rows; i++)
        {
            if(  i== 1 || i == rows)
            {
                for(int j = 1; j < rows-1; j++)
                {
                    System.out.print("* ");
                }
               
            }
            else
            {
                for(int j = 1; j <= rows; j++)
                {
                    if( j < rows)
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                    
                }
            }
           
           System.out.println(); 
        }
    }
}
