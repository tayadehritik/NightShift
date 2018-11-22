import java.util.*;


import java.lang.*;

public class CeasarCipher
{
    public static void main(String args[])
    {
        System.out.println("--------------------------------------only for single words with key of 3-----------------------------------------");
        
        String arr[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        Scanner sc = new Scanner(System.in);
        int pos = Arrays.binarySearch(arr, 0, arr.length, "D");
             
        System.out.println("enter message to encrypt\n");
        String message = sc.nextLine();
        String uppercase = message.toUpperCase();
        StringBuffer encryptedmessage = new StringBuffer(20);
        int key = 3;
        for(int i=0;i<message.length();i++)
        {
                       
            int pos1 = Arrays.binarySearch(arr, 0, arr.length, Character.toString(uppercase.charAt(i)));
            if(pos1 !=-1)
            {
                pos1 = pos1 + key;
                encryptedmessage.insert(i,arr[pos1%24]);
            }
        }
        
        
        System.out.println(encryptedmessage);

    }
}