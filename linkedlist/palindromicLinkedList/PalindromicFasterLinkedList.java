package linkedlist.palindromicLinkedList;

public class PalindromicFasterLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMiddle(head);
        ListNode midAfter = reverseList(mid);
        ListNode reRevHead = midAfter;
        
        //compare both the values
        while(head!=null && midAfter!=null){
            if(head.val != midAfter.val){
                break;
            }
            head = head.next;
            midAfter = midAfter.next;
        }
        reverseList(reRevHead);
        
        if(head == null || midAfter == null){
            return 1 == 1;
        }
        return 0 == 1;
    }
    
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode later = curr.next;
        
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = later;
            if(later !=null){
                later = later.next;
            }
        }
        
        return prev;
    }
    
    public ListNode getMiddle(ListNode head){
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
        }
        
        return s;
    }
}
