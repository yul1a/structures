package strings.length_of_last_word_58;

//58. Length of Last Word
//Easy
//
//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
//If the last word does not exist, return 0.
//Note: A word is defined as a maximal substring consisting of non-space characters only.
//Example:
//Input: "Hello World"
//Output: 5
//идти с конца запомнить позицию первого не пробела справа, доайти до пробела и остановиться  и вернуть разность позиций
class Solution {
    public int lengthOfLastWord(String a) {

        if (a == null || a == "")
            return 0;
        int positionOfWorldFromRight = -1;
        int positionOfWorldFromLeft = -1;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ') {
                if (positionOfWorldFromRight == -1) {
                    continue;
                } else {
                    break;
                }
            } else {
                if (positionOfWorldFromRight == -1) {
                    positionOfWorldFromRight = i;
                }
                positionOfWorldFromLeft = i;
            }
        }

        return positionOfWorldFromRight == -1 ? 0 : positionOfWorldFromRight - positionOfWorldFromLeft + 1;
    }
}