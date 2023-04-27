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
  void testEmptyCatalog() {
    Wall wall = new Wall(100);
    List<WardrobeElement> empty = new ArrayList<>();
    Dealer dealer = new Dealer(empty);
    assertNotNull(dealer.getCatalog());
    assertEquals(0, dealer.getCatalog().size());
    assertThrows(
        IllegalStateException.class, getCombinations(wall, dealer), "Dealer has no catalog");
  }

  @Test
  void testInvalidWallLength() {
    Wall wall = new Wall(0);
    Dealer dealer = new Dealer();
    assertThrows(
        IllegalStateException.class,
        getCombinations(wall, dealer),
        "Wall length cannot be 0 or less");
  }

  @Test
  void testWallTooSmall() {
    Wall wall = new Wall(1);
    Dealer dealer = new Dealer();
    assertEquals(0, ElementCombinations.getCombinations(wall, dealer).size());
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
  @Test
  void testCheapestOptionForOneOption() {
    Wall wall = new Wall(75);
    Dealer dealer = new Dealer();
    assertNotNull(dealer.getCatalog());
    List<ElementCombinations> combinations = ElementCombinations.getCombinations(wall, dealer);
    assertEquals(1, combinations.size());
    assertEquals(62, ElementCombinations.getMinimumPrice(combinations));
  }
}
