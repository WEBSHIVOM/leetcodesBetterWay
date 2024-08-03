package main.java.linkedlist.sumOfLinkedList;

public class SumOfLinkedList {

    public SingleLinkedListNode addTwoNumbers(SingleLinkedListNode l1, SingleLinkedListNode l2) {
        if (l1 == null && l2 != null) {
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        }

        SingleLinkedListNode l1Next = l1.next;
        SingleLinkedListNode l2Next = l2.next;
        SingleLinkedListNode sumNode = null;

        while (l1Next != null && l2.next != null) {
            int sum = l1Next.val + l2Next.val;
            int carryOver = sum / 10;
            sumNode = new SingleLinkedListNode(carryOver);
        }
        return sumNode;
    }
}
