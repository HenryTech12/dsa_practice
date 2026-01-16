package leetcode;

import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {

        Solution s = new Solution();
        ListNode l1 =  new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        s.addTwoNumbers(l1,l2);
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String firstNum = ""+l1.val;
        String secondNum = ""+l2.val;
        while(l1.next!=null) {
            l1 = l1.next;
            firstNum += l1.val;
        }
        while(l2.next!=null) {
            l2 = l2.next;
            secondNum += l2.val;
        }
        int sum = Integer.valueOf(firstNum) + Integer.valueOf(secondNum);
        String[] data = new StringBuilder(""+sum).reverse().toString().split("");



        return l1;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

