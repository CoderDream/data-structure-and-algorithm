package com.coderdream.ch02_datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Offer_05_ReplaceBlankTest {

    @Test
    void replaceSpace() {
        Offer_05_ReplaceBlank offer_05_replaceBlank = new Offer_05_ReplaceBlank();
        String s =  "We are happy.";
        String expect = "We%20are%20happy.";
        String result = offer_05_replaceBlank.replaceSpace(s);
        Assertions.assertEquals(expect, result);
    }
}