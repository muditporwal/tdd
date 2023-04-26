package com.wardrobe;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElementPlannerTest {

  private ElementPlanner planner;

  @BeforeEach
  public void setup() {
    Wall wall = new Wall(250);
    Dealer dealer = new Dealer();
    planner = new ElementPlanner(wall, dealer);
  }

  @Test
  void testElementPlannerInitialization() {
    assertEquals(250, planner.wall().lengthInCms());
    assertEquals(4, planner.dealer().getCatalog().size());
  }

  @Test
  void testEmptyCatalog() {
    Wall wall = new Wall(100);
    List<WardrobeElement> empty = new ArrayList<>();
    Dealer dealer = new Dealer(empty);
    assertNotNull(dealer.getCatalog());
    assertEquals(0, dealer.getCatalog().size());
    ElementPlanner planner = new ElementPlanner(wall, dealer);
    assertThrows(IllegalStateException.class, planner::getCombinations, "Dealer has no catalog");
  }

  @Test
  void testWallTooSmall() {
    Wall wall = new Wall(1);
    Dealer dealer = new Dealer();
    assertNotNull(dealer.getCatalog());
    ElementPlanner planner = new ElementPlanner(wall, dealer);
    assertThrows(IllegalStateException.class, planner::getCombinations, "Wall is too small");
    // TODO review if illeagal state is what we want to throw
  }

  // One element fits wall
  @Test
  void testOneElementFitsWall() {
    Wall wall = new Wall(10);
    List<WardrobeElement> one = new ArrayList<>();
    one.add(new WardrobeElement(10));
    Dealer dealer = new Dealer(one);
    assertNotNull(dealer.getCatalog());
    assertEquals(1, dealer.getCatalog().size());
    ElementPlanner planner = new ElementPlanner(wall, dealer);
    assertEquals(1, planner.getCombinations().size());
  }

  @Test
  void testOnlyOneElementFitsWall() {
    Wall wall = new Wall(75);
    Dealer dealer = new Dealer();
    assertNotNull(dealer.getCatalog());
    ElementPlanner planner = new ElementPlanner(wall, dealer);
    assertEquals(1, planner.getCombinations().size());
  }

  @Test
  void testTwoElementFitsWall() {
    Wall wall = new Wall(125);
    Dealer dealer = new Dealer();
    assertNotNull(dealer.getCatalog());
    ElementPlanner planner = new ElementPlanner(wall, dealer);
    System.out.println(planner.getCombinations());
    assertEquals(1, planner.getCombinations().size());
  }

  // remove duplicates
}
