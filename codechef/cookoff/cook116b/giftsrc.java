import java.util.*;

import javax.lang.model.util.ElementScanner6;

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
            char curr='k';
            int[] currcoords = new int[2];
            int[] nextcoords = new int[2];
            for(int i=0;i<s.length();i++)
            {
                char next = s.charAt(i);
                if(curr == next)
                {
                    continue;
                }
                else
                {
                    currcoords[0] = x;
                    currcoords[1] = y;
                    nextcoords = translateCoord(curr, currcoords[0], currcoords[1]);
                    if(!checkIfOnSameAxis(currcoords, nextcoords))
                    {
                        x = nextcoords[0];
                        y = nextcoords[1];
                    }
                }
                curr = next;
            }
            System.out.println(x+" "+y);
            t = t-1;
        }


    }
    public static boolean checkIfOnSameAxis(int[] currcoords, int[] nextcoords)
    {
        if(nextcoords[0] - currcoords[0] == 0)
        {
            //moving on x axis
            return true;
        }
        else if(nextcoords[1]- nextcoords[0] == 0)
        {
            //moving on y axis
            return true;
        }
        else
        {
            return false;
        }
        

        
    }

    public static int[] translateCoord(char dir, int x, int y)
    {
        int[] coord = new int[2];
        coord[0] = x;
        coord[1] = y;
    
        if(dir == 'U')
        {
            
             coord[1] = coord[1] + 1;
       }
        else if(dir == 'L')
        {
             coord[0] = coord[0] - 1;
             
        }
        else if(dir == 'R')
        {
            coord[0] = coord[0]+1;
            
        }
        else if(dir == 'D')
        {
            
            coord[1] = coord[1] -1;
        }              
        return coord;
    }
}