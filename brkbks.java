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
            
            int width[] = new int[3];
            for(int j=0;j<3;j++)
            {
                width[j] = sc.nextInt();
                
            }

            int temp = 0;
            int trav = 0;
            int mode = 0;
            while(trav < 3 && trav >=0)
            {
                temp = temp + width[trav];
                if(mode == 0)
                {   
                    

                    if(temp == strength)
                    {
                        temp = 0;
                        hit = hit + 1;
                    }
                    else if(temp > strength)
                    {
                        temp = temp - width[trav-1];
                        hit = hit + 1;
                        /*if(width[trav-1] < strength)
                        {
                            hit = hit + 1;
                            
                        }*/

                        

                        //trav = trav -1;
                        
                    }

                    trav = trav + 1;
                }
                else if(mode == 1)
                {
                    
                }
                


            }


            if(temp > 0 && temp <= strength)
            {
                
                hit = hit + 1;
            }
            


            
            System.out.println(hit);

        }
    }
}