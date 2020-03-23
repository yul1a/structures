package strings.Implement_strStr_28;

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())    return -1;
        if (haystack == null || haystack == ""|| needle == null || needle == "" || haystack == needle)             {return 0;}
        for (int i = 0; i < haystack.length(); i++){
            if (haystack.charAt(i) == needle.charAt(0))
            {
                if ((haystack.length() - i) < needle.length()-1)    return -1;
                else{
                    if (haystack.substring(i, needle.length()-1) == needle) return i;
                    else    continue;
                }
            }
        }
        return -1;

    }
}