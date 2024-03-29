package kent.alg.leetcode;
/**
   Merge two sorted linked lists and return it as a new list. 
   The new list should be made by splicing together the nodes of the first two lists.
   ex: 
      Input: 1->2->4, 1->3->4
      Output: 1->1->2->3->4->4
 * @author kentfan
 *
 */
public class MergeTwoSortedLists {
	/** Definition for singly-linked list. **/
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				cur.next = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				cur.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			cur = cur.next;
		}
		
		if(l1 != null) {
			cur.next = l1;
		} else {
			cur.next = l2;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
