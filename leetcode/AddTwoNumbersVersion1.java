package leetcode;

import java.math.BigInteger;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbersVersion1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (l1 != null) {
            sb1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            sb2.append(l2.val);
            l2 = l2.next;
        }

        BigInteger num1 = new BigInteger(sb1.reverse().toString());
        BigInteger num2 = new BigInteger(sb2.reverse().toString());
        char[] sum = String.valueOf(num1.add(num2)).toCharArray();
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int i = sum.length - 1; i >= 0; i--) {
            int val = Character.getNumericValue(sum[i]);
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Creating test data for l1: [9,9,9,9,9,9,9]
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));

        // Creating test data for l2: [9,9,9,9]
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        AddTwoNumbersVersion1 solution = new AddTwoNumbersVersion1();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }

}