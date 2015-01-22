/* Problem Statement-
https://www.hackerrank.com/challenges/pangrams
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine(); // read entire line as input
        s = s.toLowerCase(); // convert to lower case string
        char[] arr = s.toCharArray();
        boolean[] alpha = new boolean[26]; // array to store presence of each alphabet
        for(char ch : arr)
        {
        	if(ch != ' ')
        	{
        		alpha[ch - 'a'] = true;
        	}
        }
        
        // check whether every alphabet is present in the string
        for(int i = 0; i < 26; i++)
        {
        	if(!alpha[i])
        	{
        		System.out.println("not pangram");
        		input.close();
        		return;
        	}
        }
        System.out.println("pangram");
        input.close();
     }
}