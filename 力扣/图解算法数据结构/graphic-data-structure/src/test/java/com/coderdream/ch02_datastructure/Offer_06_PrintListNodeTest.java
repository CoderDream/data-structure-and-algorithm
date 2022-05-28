package com.coderdream.ch02_datastructure;

import com.coderdream.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Offer_06_PrintListNodeTest {

    @Test
    void reversePrint() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(2);
        one.setNext(two);
        two.setNext(three);

        Offer_06_PrintListNode offer_06_printListNode = new Offer_06_PrintListNode();


        int[] expect = new int[]{2, 3, 1};
        int[] result = offer_06_printListNode.reversePrint(one);

        for (int i = 0; i < expect.length; i++) {
            Assertions.assertEquals(expect[i], result[i]);
        }
    }
}