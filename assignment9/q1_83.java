package home_ass;
import java.util.*;
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
public class q1_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        return null;
        
        ListNode slow=head;
 
        while(slow.next!=null){
            if(slow.val==slow.next.val){
                slow.next=slow.next.next;
              
            }
            else{
                slow=slow.next;
                
            }
            
        }
        return head;
}
