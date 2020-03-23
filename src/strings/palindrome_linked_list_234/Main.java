package strings.palindrome_linked_list_234;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        var m1 = new ListNode(-129);
        var m2 = new ListNode(-129);
        m1.next = m2;
        System.out.println(s.isPalindrome(m1) + " : expected true");

        var s1 = new ListNode(1);
        System.out.println(s.isPalindrome(s1) + " : expected true");

        var s2 = new ListNode(2);
        s1.next = s2;
        System.out.println(s.isPalindrome(s1) + " : expected false");

        s2.val = 1;
        System.out.println(s.isPalindrome(s1) + " : expected true");
        var a1 = new ListNode(1);
        var a2 = new ListNode(2);
        var a3 = new ListNode(3);
        var a4 = new ListNode(3);
        var a5 = new ListNode(2);
        var a6 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        System.out.println(s.isPalindrome(a1) + " : expected true");


        a4.val = 1;
        System.out.println(s.isPalindrome(a1) + " : expected false");

        a4.val = 3;
        System.out.println(s.isPalindrome(a1) + " : expected true");
        var a7 = new ListNode(1);
        a6.next = a7;
        System.out.println(s.isPalindrome(a1) + " : expected false");



    }
}
