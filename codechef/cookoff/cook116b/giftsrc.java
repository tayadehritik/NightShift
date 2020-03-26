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
                    {}
                    else if(curr == 'L')
                    {}
                    else if(curr == 'R')
                    {}
                    else if(curr == 'D')
                    {}
                }
            }

            t = t-1;
        }


    }

}