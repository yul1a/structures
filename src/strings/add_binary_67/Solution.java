package strings.add_binary_67;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aCnt = a.length() - 1;
        int bCnt = b.length() - 1;
        boolean carry = false;

        while(carry || aCnt >= 0 || bCnt >= 0){
            char ca = aCnt < 0 ? '0' : a.charAt(aCnt--);
            char cb = bCnt < 0 ? '0' : b.charAt(bCnt--);

            if(ca == '1' && cb == '1' && carry){
                sb.insert(0,'1');
                carry = true;
            } else if(ca == '1' && cb == '1'){
                sb.insert(0, '0');
                carry = true;
            } else if((ca == '1' || cb == '1') && carry){
                sb.insert(0, '0');
                carry = true;
            } else if(ca == '1' || cb == '1' || carry){
                sb.insert(0, '1');
                carry = false;
            } else {
                sb.insert(0, '0');
                carry = false;
            }
        }

        return sb.toString();
    }

}
