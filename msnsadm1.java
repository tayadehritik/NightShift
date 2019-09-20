import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0)
		{
			int n = sc.nextInt();
			
			int[] a_goals = new int[n];
			int[] b_fouls = new int[n];
			
			
			for(int i=0;i<n;i++)
			{

				a_goals[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				b_fouls[i] = sc.nextInt();
			}



			int max = (a_goals[0]*20)-(b_fouls[0]*10);

			


			for(int i=0;i<n;i++)
			{
				
				int mulgoal = a_goals[i] * 20;
				int mulfoul = b_fouls[i] * 10;
				int final_points = mulgoal - mulfoul;
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

