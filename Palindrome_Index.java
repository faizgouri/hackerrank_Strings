/* Problem Statement
https://www.hackerrank.com/challenges/palindrome-index  */

import java.io.*;
import java.util.*;

public class Solution
{
    
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0 ; i < t; i++)
        {
        	int res = -1;
        	String str = input.next();
        	char[] arr = str.toCharArray(); // convert to char[] for faster access
        	int len = str.length();
            
            // iterate through string till middle element and check whether first element equal to last, second equal to second last and so on
        	for(int j = 0 ; j < len / 2; j++)
        	{
                // we have found the mismatch
        		if(arr[j] != arr[len - 1 - j])
        		{
                    // check whether jth char is our answer of (len - 1 - j)th char
        			if(arr[j + 1] == arr[len - 1 - j] && arr[j + 2] == arr[len - 2 - j])
        			{
        				res = j;
        			}
        			else
        			{
        				res = len - 1 - j;
        			}
        			break;
        		}
        	}
        	System.out.println(res);
        }
        input.close();
     }
}