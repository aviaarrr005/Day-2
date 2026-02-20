import java.util.Scanner;

public class Pattern7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i%2==0)
                {
                    int k = n*i + 1;
                    while(k<=n*(i+1))
                    {
                        System.out.printf("%3d ",k);
                        k++;
                    }
                    break;
                }
                else
                {
                    int k = n*(i + 1);
                    while(k>=n*i+1)
                    {
                        System.out.printf("%3d ",k);
                        k--;
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}
