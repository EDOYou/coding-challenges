package leetcode;

public class AddTwoNumbersVersion2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode model = new ListNode();
        ListNode current = model;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum %= 10;
            current.next = new ListNode(sum);
            current = current.next;
        }

        return model.next;
    }

    public static void main(String[] args) {
        // Creating test data for l1: [9,9,9,9,9,9,9]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Creating test data for l2: [9,9,9,9]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbersVersion2 solution = new AddTwoNumbersVersion2();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }

        System.out.println("null");
    }
}