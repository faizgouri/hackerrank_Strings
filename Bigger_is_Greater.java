/* Problem Statement -
https://www.hackerrank.com/challenges/bigger-is-greater
*/
import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++)
        {
        	boolean flag = false;
        	char[] str = input.next().toCharArray();
        	int len = str.length;
        	int j = 0;
        	int pos = 0;
        	if(len > 1)
        	{   
        		// Starting from the last element, check for the position where element is smaller than its subsequent elements
        		for(j = len - 1; j > 0; j--)
	        	{
        			if(str[j] > str[j - 1])
		        	{
		           		flag = true; // to indicate that we have an answer
		        		pos = j - 1;
		        		break;
		        	}
	        	}
        		
        		// Swap the element we found with an element which is just bigger than all its subsequent elements 
        		for(j = len - 1; j > pos; j--)
	        	{
        			if(str[j] > str[pos])
        			{
        				char temp = str[j];
		        		str[j] = str[pos];
		        		str[pos] = temp;
		        		break;
        			}
	        	}
        		
        		// sort all the elements
        		for(int k = pos + 1; k < len; k++)
        		{
        			for(int l = k + 1; l < len; l++)
        			{
        				if(str[k] > str[l])
        				{
        					char temp = str[k];
    		        		str[k] = str[l];
    		        		str[l] = temp;
        				}
        			}
        		}
        	}
        	if(flag)
        	{
        	   		System.out.println(str);
        	}
        	else
        	{
        		System.out.println("no answer");
        	}
        }
        
        input.close();
     }
}