package com.tdd.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class RecursionTest {

  @Test
  void testEmptyListReversal() {
    List<String> low = new ArrayList<>();
    List<String> reverse = Recursion.reverse(low);
    assertEquals(low, reverse);
  }

  @Test
  void testBaseCaseSingleItemListReversal() {
    List<String> low = new ArrayList<>();
    String thing = "hello";
    low.add(thing);
    List<String> reverse = Recursion.reverse(low);
    assertEquals(low, reverse);
  }

  @Test
  void testRecursiveCaseTwoItemListReversal() {
    List<String> low = new ArrayList<>();
    String hello = "hello";
    String world = "world";
    low.add(hello);
    low.add(world);

    List<String> expected = new ArrayList<>();
    expected.add(world);
    expected.add(hello);
    List<String> reverse = Recursion.reverse(low);
    assertEquals(expected, reverse);
  }
}
