package Easy;

import javax.swing.plaf.ListUI;

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
class   Problem21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy= new ListUI(0);
        ListNode current= dummy;
        while(list1 !=null && list2 !=null){
            if(list1.val <= list2.val) {
                current.next=list1; 
                list1=list1.next;
            }
            else {
                current.next=list2;
                list2= list2.next;
            }
            current =current.next;
        }
        current.next= list1 ==null? list2: list1;
        return dummy.next;
    }
}
