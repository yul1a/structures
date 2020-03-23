package strings.palindrome_linked_list_234;

//234. isPalindrome
//Easy

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome2(ListNode head) {
        //go fast to the end

        ListNode current = head;
        while (current != null && current.next != null && current.next.next != null)
        {
            current = current.next.next;
        }
        return true;

        // reverse
        ///head = reverse(head);
        // compare
    }
    private void reverse(ListNode head){
        //1 -> 2 -> 3
        //3 -> 2 -> 1
    }
    public boolean isPalindrome(ListNode head) {
        List<Integer> sb =  new ArrayList<Integer>();
        int counter = 0;

        ListNode current = head;
        while (current != null) {
            sb.add(current.val);
            current = current.next;
            counter ++;
        }
        for (int i = 0; i < counter / 2; i ++) {
            if (!sb.get(i) .equals(sb.get( counter -1  - i)))
                return false;
        }
        return true;
    }
}


