/* Problem Statement -
https://www.hackerrank.com/challenges/gem-stones  */

import java.io.*;
import java.util.*;

public class Solution
{
    
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res = 0;
        
        boolean[] alpha1 = new boolean[26]; // to store info about first string
        
        // convert String to char array, for faster execution
        char[] str1 = input.next().toCharArray();
    	
        // for each character in string, set corresponding value in alpha1[] to true
        for(char ch : str1)
    	{
    		alpha1[ch - 'a'] = true;
    	}
        
        // iterate through each rock except first
        for(int i = 1; i < n; i++)
        {
        	boolean[] alpha2 = new boolean[26];
        	char[] str = input.next().toCharArray();
        	// store info about current rock
            for(char ch1 : str)
        	{
        		alpha2[ch1 - 'a'] = true;
        	}
            
            // In alpha1[], take only those characters which are common to alpha1[] and current rock
        	for(int j = 0 ; j < 26; j++)
            {
            	alpha1[j] = alpha1[j] && alpha2[j];
            }
        	
        }
        
        // check number of characters in alpha1[], which is our ans
        for(int i = 0 ; i < 26; i++)
        {
        	if(alpha1[i])
        	{
        		res++;
        	}
        }
        System.out.println(res);
        input.close();
     }
}