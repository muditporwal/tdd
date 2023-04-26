package com.wardrobe;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class ElementCombinationsTest {

  private static Executable getCombinations(Wall wall, Dealer dealer) {
    return () -> ElementCombinations.getCombinations(wall, dealer);
  }

  @Test
  void testWallTooSmall() {
    Wall wall = new Wall(1);
    Dealer dealer = new Dealer();
    assertThrows(IllegalStateException.class, getCombinations(wall, dealer), "Wall is too small");
    // TODO review if illegal state is what we want to throw
  }

  // One element fits wall
  @Test
  void testOneElementFitsWall() {
    Wall wall = new Wall(10);
    List<WardrobeElement> one = new ArrayList<>();
    one.add(new WardrobeElement(10));
    Dealer dealer = new Dealer(one);
    List<WardrobeElement> catalog = dealer.getCatalog();
    assertNotNull(catalog);
    assertEquals(1, catalog.size());
    assertEquals(1, ElementCombinations.getCombinations(wall, dealer).size());
  }

  @Test
  void testOnlyOneElementFitsWall() {
    Wall wall = new Wall(75);
    Dealer dealer = new Dealer();
    assertNotNull(dealer.getCatalog());

    assertEquals(1, ElementCombinations.getCombinations(wall, dealer).size());
  }

  @Test
  void testTwoElementFitsWall() {
    Wall wall = new Wall(125);
    Dealer dealer = new Dealer();
    assertNotNull(dealer.getCatalog());
    assertEquals(1, ElementCombinations.getCombinations(wall, dealer).size());
  }

  // remove duplicates
}
