import java.util.Scanner;

public class Pattern4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Columns: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= (n*8)+1 ; j++)
            {
                if((i==1 && j%8==5) || (i==2 && j%4==3) || (i==3 && j%8==1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}