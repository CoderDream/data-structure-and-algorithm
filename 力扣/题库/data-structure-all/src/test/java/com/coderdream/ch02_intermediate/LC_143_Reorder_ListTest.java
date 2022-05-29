package com.coderdream.ch02_intermediate;

import com.coderdream.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * Input: head = [1,2,3,4]
 * Output: [1,4,2,3]
 * Example 2:
 * Input: head = [1,2,3,4,5]
 * Output: [1,5,2,4,3]
 */
class LC_143_Reorder_ListTest {

    @Test
    void reorderList() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(null);

        LC_143_Reorder_List lc143ReorderList = new LC_143_Reorder_List();

        lc143ReorderList.reorderList(one);

        Assertions.assertEquals(1, one.getVal());
        one = one.getNext();
        Assertions.assertEquals(4, one.getVal());
        one = one.getNext();
        Assertions.assertEquals(2, one.getVal());
        one = one.getNext();
        Assertions.assertEquals(3, one.getVal());
    }

    @Test
    void reorderListTwo() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);
        five.setNext(null);

        LC_143_Reorder_List lc143ReorderList = new LC_143_Reorder_List();

        lc143ReorderList.reorderList(one);

        Assertions.assertEquals(1, one.getVal());
        one = one.getNext();
        Assertions.assertEquals(5, one.getVal());
        one = one.getNext();
        Assertions.assertEquals(2, one.getVal());
        one = one.getNext();
        Assertions.assertEquals(4, one.getVal());
        one = one.getNext();
        Assertions.assertEquals(3, one.getVal());
    }
}