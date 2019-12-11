import java.util.*;

class watscore
{
	public static void main(String args[])
	{
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int submissions = sc.nextInt();
			Map<Integer, Integer> hm = new HashMap<Integer,Integer>();
			for(int j=0;j<submissions;j++)
			{
				int problem = sc.nextInt();
				int marks = sc.nextInt();
				if(problem>8)
				{
					continue;
				}
				else if(!hm.containsKey(problem))
				{
					hm.put(problem,marks);
				}
				else
				{
					int comparewith = hm.get(problem);
					if(marks>comparewith)
					{
						hm.put(problem,marks);
					}
				}
			}
		
			int score = 0;
			for(Integer marks: hm.values())
			{
				score = score + marks;
			}
			System.out.println(score);

			

		}	
	}
}
