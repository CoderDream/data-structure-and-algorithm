package com.coderdream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}
