package com.coderdream.ch02_intermediate;

import com.coderdream.ListNode;

/**
 * 143. Reorder List
 * You are given the head of a singly linked-list. The list can be represented as:
 *
 * L0 → L1 → … → Ln - 1 → Ln
 * Reorder the list to be on the following form:
 *
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 *
 * Example 1:
 * Input: head = [1,2,3,4]
 * Output: [1,4,2,3]
 * Example 2:
 * Input: head = [1,2,3,4,5]
 * Output: [1,5,2,4,3]
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [1, 5 * 104].
 * 1 <= Node.val <= 1000
 */
public class LC_143_Reorder_List {
    public void reorderList(ListNode head) {
        ListNode midNode = getMidNode(head);
        ListNode next = reverse(midNode.getNext());
        midNode.setNext(null);
        merge(head, next);
        System.out.printf(head.val + "");
    }

    /**
     * 合并链表
     * @param l1
     * @param l2
     */
    private void merge(ListNode listNode1, ListNode listNode2) {
        while (null != listNode1 && null != listNode2) {
            // 临时保存下一个指针
            ListNode nextListNode1 = listNode1.next;
            ListNode nextListNode2 = listNode2.next;
            // 把L2插入L1后面
            listNode1.next = listNode2;
            // 把L1插入L2后面
            listNode2.next = nextListNode1;
            // L1、L2重新指向N1、N2
            listNode1 = nextListNode1;
            listNode2 = nextListNode2;
        }
    }

    /**
     * 通过快慢指针实现，快指针跑完了，慢指针就是中间节点
     * 获取中间节点
     * 节点数为奇数时返回中间节点，节点数为偶数时，返回中间左侧的节点
     * @param head
     * @return
     */
    private ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // 快速指针
        while (null != fast.getNext() && null != fast.getNext().getNext()) {
            // 慢指针每次移动一个节点
            slow = slow.getNext();
            // 快指针每次移动两个节点
            fast = fast.getNext().getNext();
        }
        // 返回慢节点
        return slow;
    }


    /**
     * 翻转列表
     * @param head
     * @return
     */
    private  ListNode reverse2(ListNode head) {
        ListNode reverseHead = null;
        ListNode currentNode = head;
        ListNode preNode = null;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            if(nextNode == null) {
                reverseHead = currentNode;
            }
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }

        return reverseHead;
    }

    /**
     * 翻转列表
     * @param head
     * @return
     */
    private  ListNode reverse(ListNode head) {
        // 当前节点 [4,5,6](4)
        ListNode cur = head;
        // 前一个临时节点
        ListNode pre = null;
        // 如果没有到达末尾节点
        while (null != cur) {
            // 获取下一个节点[4,5,6](5)
            ListNode next = cur.next;
            // 设置当前节点的下一个节点为前一个临时节点[5,4]
            cur.next = pre;
            // 设置当前节点为临时节点pre [4]
            pre = cur;
            // 设置下一个节点为当前节点cur [5]
            cur = next;
        }
        // 返回前一个节点
        return pre;
    }
}
