package StringManipulation;
import java.util.LinkedHashMap;

public class LongestSubsequenceInString
{
    static void longestSubstring(String inputString)
    {
        //Convert inputString to charArray

        char[] charArray = inputString.toCharArray();

        //Initialization

        String longestSubstring = null;

        int longestSubstringLength = 0;

        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();

        //Iterating through charArray

        for (int i = 0; i < charArray.length; i++)
        {
            char ch = charArray[i];

            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
            else
            {
                i = charPosMap.get(ch);

                charPosMap.clear();
            }

            //Updating longestSubstring and longestSubstringLength

            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();

                longestSubstring = charPosMap.keySet().toString();
            }
        }

        System.out.println("Input String : "+inputString);

        System.out.println("The longest substring : "+longestSubstring);

        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }

    public static void main(String[] args)
    {
        longestSubstring("abcdabcbb");

        System.out.println("==========================");

        longestSubstring("thelongestsubstring");
    }
}