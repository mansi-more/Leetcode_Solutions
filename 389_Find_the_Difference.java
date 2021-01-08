/*
You are given two strings s and t.
String t is generated by random shuffling string s and then add one more letter at a random position.
Return the letter that was added to t.

Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.

Example 2:
Input: s = "", t = "y"
Output: "y"

Example 3:
Input: s = "a", t = "aa"
Output: "a"

Example 4:
Input: s = "ae", t = "aea"
Output: "a"

Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lower-case English letters.

*/
/*
This is essentially the same question as "Single Number". 
This works because applying the XOR operation on a number with itself returns zero. 
Because there are two lists with duplicate numbers, there are pairs of every character except for one (the one we are trying to find). 
So if we XOR all values with themselves, the result will be 0 as they will all 'zero' each other out, except for the number that does not have a pair. 
This is what we will return.
*/
/*
int result = 0;
    for(int i = 0; i < s.length(); i++){
        result = result ^ (int)s.charAt(i);
    }
    
    for(int i = 0; i < t.length(); i++){
        result = result ^ (int)t.charAt(i);
    }
 
    return (char)result;
*/
class Solution {
    public char findTheDifference(String s, String t) 
    {
        char ch = 'a' ;
        int arr[] = new int[26];
        
        for(int i = 0; i < s.length(); i++)
        {
            arr[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < t.length(); i++)
        {
            arr[t.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++)
        {
            if(arr[i] % 2 != 0)
            {
                break;
            }    
            ch++;
                
        }
        //System.out.println("ch "+ch);
        
        return ch;
    }
}
