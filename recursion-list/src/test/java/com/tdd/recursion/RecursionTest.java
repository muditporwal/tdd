package com.tdd.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class RecursionTest {

  @Test
  void testListCreation() {
    List<String> low = new ArrayList<>();
    List<String> reverse = Recursion.reverse(low);
    assertEquals(low, reverse);
  }
}
