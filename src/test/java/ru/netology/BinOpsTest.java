package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinOpsTest {
    BinOps bins = new BinOps();

    @Test
    void sum() {
        Assertions.assertEquals(bins.sum("1111101","1111101"),"11111010");
    }

    @Test
    void mult() {
        Assertions.assertEquals(bins.mult("1111101","1111101"),"11110100001001");
    }
}