package com.coderdream;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
