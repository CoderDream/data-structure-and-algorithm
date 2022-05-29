package com.coderdream.ch02_datastructure;

import com.coderdream.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Offer_24_ReverseListTest {

    @Test
    void reverseList() {
        Offer_24_ReverseList offer24ReverseList = new Offer_24_ReverseList();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;

        ListNode node = offer24ReverseList.reverseList(head);
        Assertions.assertEquals(5, node.val);
        node = node.next;
        Assertions.assertEquals(4, node.val);
        node = node.next;
        Assertions.assertEquals(3, node.val);
        node = node.next;
        Assertions.assertEquals(2, node.val);
        node = node.next;
        Assertions.assertEquals(1, node.val);
        Assertions.assertEquals(null, node.next);
    }
    
    @Test
    void reverseListWithRecursive() {
        Offer_24_ReverseList offer24ReverseList = new Offer_24_ReverseList();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;

        ListNode node = offer24ReverseList.reverseListWithRecursive(head);
        Assertions.assertEquals(5, node.val);
        node = node.next;
        Assertions.assertEquals(4, node.val);
        node = node.next;
        Assertions.assertEquals(3, node.val);
        node = node.next;
        Assertions.assertEquals(2, node.val);
        node = node.next;
        Assertions.assertEquals(1, node.val);
        Assertions.assertEquals(null, node.next);
    }
}