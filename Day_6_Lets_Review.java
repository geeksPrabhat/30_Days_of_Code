import java.util.Scanner;

public class Day_6_Lets_Review
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String string = sc.nextLine();
            char[] charArray = string.toCharArray();
 
            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(charArray[j]);
                } 
            }
            System.out.print(" ");
            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 != 0)
                {
                    System.out.print(charArray[j]);
                } 
            }
            System.out.println();
        }
        sc.close();
    }
}