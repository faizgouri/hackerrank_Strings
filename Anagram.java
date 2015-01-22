/* Problem Statement
https://www.hackerrank.com/challenges/anagram */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int res;
        for(int i = 0; i < t; i++)
        {
        	res = 0;
        	String str = input.next();
        	int len = str.length();
        	
            // if length of input string is odd then we cannot divide it into 2 strings, so result is -1
            if(len % 2 == 1)
        	{
        		res--;
        		System.out.println(res);
        		continue;
        	}
            
            // Divide input string into 2 strings
        	String str1 = str.substring(0, len /2);
        	String str2 = str.substring( len / 2, len);
        	
            // count number of each alphabet in both the strings
        	int[] char_count1 = new int[26];
        	int[] char_count2 = new int[26];
        	for(int j = 0; j < str1.length(); j++)
        	{
        		char_count1[str1.charAt(j) - 'a']++;
        	}
        	for(int j = 0; j < str2.length(); j++)
        	{
        		char_count2[str2.charAt(j) - 'a']++;
        	}
        	
            // Calculate the result
        	for(int j = 0; j < 26; j++)
        	{
        		if(char_count2[j] > 0 && char_count2[j] > char_count1[j])
        		{
        			res = res + char_count2[j] - char_count1[j];
        		}
        	}
        	System.out.println(res);
        }
        input.close();
     }
}