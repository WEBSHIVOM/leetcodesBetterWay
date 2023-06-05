package src.main.java.linkedlist.palindromicLinkedList;


public class palindromicLinledlist {
    
    public boolean checkIfPalindrome(ListNode head){
      if(head==null || head.next==null){
        return true;
      }
      ListNode midd=findMiddleNode(head);
      ListNode secondHalf=reverseLinkedList(midd.next);
      ListNode firstHalf=head;
      while(secondHalf!=null){
        if(secondHalf.val!=firstHalf.val){
            return false;
        }
       firstHalf=firstHalf.next;
       secondHalf=secondHalf.next;
      }
    return true;
    }

    private ListNode findMiddleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
         slow=head.next;
         fast=head.next.next;
        }
        return slow;
    }

    private ListNode reverseLinkedList(ListNode node){
        ListNode prev=null;
        ListNode curr=node;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        ListNode N1= new ListNode(3, node);
        ListNode n2=new ListNode(2,N1);

        System.out.println(new palindromicLinledlist().checkIfPalindrome(n2));
    }
}

 // Definition for singly-linked list.
 class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

