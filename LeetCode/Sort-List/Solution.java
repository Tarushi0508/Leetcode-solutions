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
    public ListNode sortList(ListNode head) {
        if(head==null)return null;
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        ListNode temp1=dummy;
        for(int val:list){
            temp1.next=new ListNode(val);
            temp1=temp1.next;
        }
        return dummy.next;
    }
}