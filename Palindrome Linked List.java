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
    public boolean isPalindrome(ListNode head) {
        ListNode p1=head;
        List<Integer> num=new ArrayList<>();
        while(p1!=null){
            num.add(p1.val);
            p1=p1.next;
        }
        int p2=num.size()-1;
        for(int i=0;i<p2;i++){
            if(num.get(i)==num.get(p2))
                p2--;
            else
                return false;
        }
        return true;
    }
}
