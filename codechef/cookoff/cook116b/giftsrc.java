import java.util.*;
import java.lang.*;
import java.io.*;

class giftsrc
{

    public static void main(String args[]) throws IOException
    {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        while(t!=0)
        {
            int x = 0;
            int y = 0;
            int n = Integer.parseInt(sc.readLine());
            String s = sc.readLine();
            char prev='k';
            for(int i=0;i<s.length();i++)
            {
                char curr = s.charAt(i);
                if(prev == curr)
                {
                    continue;
                }
                else
                {
                    if(curr == 'U')
                    {
                        x = x;
                        y = y + 1;
                    }
                    else if(curr == 'L')
                    {
                        x = x - 1;
                        y = y ;
                    }
                    else if(curr == 'R')
                    {
                        x = x+1;
                        y = y;
                    }
                    else if(curr == 'D')
                    {
                        x = x;
                        y = y -1;
                    }
                }
                prev = curr;
            }
            System.out.println(x+" "+y);
            t = t-1;
        }


    }
    public static boolean checkIfOnSameAxis(char prevdir, char currdir)
    {

    }

}