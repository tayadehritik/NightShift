import java.util.*;

import javax.lang.model.util.ElementScanner6;


class crdgame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n = sc.nextInt();
            int arr[][] = new int[n][2];
            int chefsPointsForGame = 0;
            int mortysPointsForGame = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<2;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<n;i++)
            {
                int chefsPointsForRound = GetSum(arr[i][0]);
                int mortysPointsForRound = GetSum(arr[i][1]);
                
                if(chefsPointsForRound > mortysPointsForRound)
                {
                    chefsPointsForGame = chefsPointsForGame + 1;
                }
                else if(mortysPointsForRound > chefsPointsForRound)
                {
                    mortysPointsForGame = mortysPointsForGame + 1;
                }
                else
                {
                    chefsPointsForGame = chefsPointsForGame + 1;
                    mortysPointsForGame = mortysPointsForGame + 1;
                }
                
            }
            
            if(chefsPointsForGame > mortysPointsForGame)
            {
                System.out.println(0+" "+chefsPointsForGame);
            }
            else if(mortysPointsForGame > chefsPointsForGame)
            {
                System.out.println(1+" "+mortysPointsForGame);
            }
            else
            {
                System.out.println(2+" "+chefsPointsForGame);
            }

        

        }

        
    }

    public static int[] SplitInteger(int num)
    {
        String stringNumber = Integer.toString(num);
        char newArr[] = stringNumber.toCharArray();
        int arr[] = new int[newArr.length];
        for(int i=0;i<newArr.length;i++)
        {
            arr[i] = Character.getNumericValue(newArr[i]);
        }
        return arr; 
    }

    public static int GetSum(int num)
    {
        int sum = 0;
        int arr[] = SplitInteger(num);
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        return sum;

    }
}