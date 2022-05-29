package com.coderdream.ch02_datastructure;

import com.coderdream.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * 限制：
 * 0 <= 节点个数 <= 5000
 *
 * 作者：Krahets
 * 链接：https://leetcode.cn/leetbook/read/illustration-of-algorithm/9pdjbm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Offer_24_ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode next = cur.next; // 暂存后继节点
            cur.next = pre; // 修改 next 引用指向
            pre = cur; // pre 暂存 cur
            cur = next; // cur 访问下一节点
        }

        return pre;
    }

    public ListNode reverseListWithRecursive(ListNode head) {
        return recur(head, null); // 调用递归并返回
    }

    private ListNode recur(ListNode cur, ListNode pre){
        if(cur == null) {
            return pre;// 终止条件
        }
        ListNode res = recur(cur.next, cur); // 递归后继节点
        cur.next = pre; // 修改节点引用指向
        return res;
    }
}

