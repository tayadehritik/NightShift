import java.util.*;

public class msnsadm1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
			int n = sc.nextInt();
			//20 points for goal
			//10 points for foul
			//<0 points goes to 0 points
			int[] a_goals = new int[n];
			int[] b_fouls = new int[n];
			
			int max = a_goals[0];

			for(int i=0;i<n;i++)
			{
				
				int mul-goal = a_goals[i] * 20;
				int mul-foul = b_fouls[i] * 10;
				int final_points = mul-goal - mul-foul;
				if(final_points<0)
				{
					final_points = 0;
				}

				if(final_points>max)
				{
					max = final_points;
				}

			}

			System.out.println(max);
			

			t--;
		}
	}
}

