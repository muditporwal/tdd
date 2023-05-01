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

  // Recursion
  // Tail Recursion or Head Recursion
  // For Tail Recursion need an accumulator to be passed into the function
  // For Head Recursion can benefit if using memoization
  // In this case memoization depends on data but I do not see why we should memoize
  // Also head recursion will need breaking the list into sublists
  // Try 1 : Head Recursion [head | sublist] = list
  // Try 2 : Tail recursion [accumlator] - Add to accumulator when ends
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
