import java.util.*;

class brkbks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int strength = sc.nextInt();
            int hit = 0;
            int frontsum = 0;
            int backsum = 0;
            int fronthit = 0;
            int backhit = 0;
            int tempsum = 0;
            int sum = 0;
            int width[] = new int[3];
            for(int j=0;j<3;j++)
            {
                width[j] = sc.nextInt();
                sum = sum + width[j];
            }

            int temp = 0;
            int trav = 0;
            int mode = 0;
            while(trav < 3 && trav >= 0 )
            {
                if(mode == 0)
                {
                    temp = temp + width[trav];

                    if(temp == strength)
                    {
                        temp = 0;
                        hit = hit + 1;
                    }
                    else if(temp > strength)
                    {
                        temp = temp - width[trav-1];

                        if(temp < strength)
                        {
                            hit = hit + 1;
                            temp = 0;
                        }

                        trav = trav -1;
                        
                    }

                    trav = trav + 1;
                }
                


            }


            if(temp > 0 && temp <= strength)
            {
                temp = 0;
                hit = hit + 1;
            }
            


            
            System.out.println(hit);

        }
    }
}