package com.example.lagou.day01;

import java.util.List;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long l1Value = 0; // 累加：把链表转成数字，注意次序为逆序
        int digit = 0; // 位数：0代表个位，1代表十位，依次递增
        while (l1 != null) { // 链表的下一个节点，若没有节点返回，l1为null
            int pow = (int)Math.pow(10, digit); // 该数字对应的位数，从0开始
            l1Value += (long)l1.val * pow; // 累加：在当前数值基础上增加新的一个高位
            digit++; // 位数加1
            l1 = l1.next; // 链表指向下一个节点
        }
        long l2Value = 0; // 累加：把链表转成数字，注意次序为逆序
        digit = 0; // 位数：0代表个位，1代表十位，依次递增
        while (l2 != null) { // 链表的下一个节点，若没有节点返回，l1为null
            int pow = (int)Math.pow(10, digit); // 该数字对应的位数，从0开始
            l2Value += (long)l2.val * pow; // 累加：在当前数值基础上增加新的一个高位
            digit++; // 位数加1
            l2 = l2.next; // 链表指向下一个节点
        }

        ListNode head = new ListNode(); // 创建一个新链表，头部为空节点
        ListNode cur = head;
        long sum = l1Value + l2Value; // 数字相加，注意越界问题
        if(sum == 0) {
            head = new ListNode(0);
            return head;
        }
        while (sum > 0) { // 数字再转成链表
            int val = (int)(sum % 10); // 每次取当前最低位
            cur.next = new ListNode(val); // 创建新节点，插入链表尾部
            cur = cur.next; // 链表尾部指针移动
            sum = sum / 10; // 移除最低位
            System.out.println("sum: " + sum);
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(3);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int x) {
        val = x;
    }
}