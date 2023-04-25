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

  // Find out computation logic
  // Wall too small
  // One element fits wall
  // Two elements fit the wall
  // More than two elements fit the wall

  @Test
  void testEmptyCatalog() {
    Wall wall = new Wall(100);
    List<WardrobeElement> empty = new ArrayList<>();
    Dealer dealer = new Dealer(empty);
    assertNotNull(dealer.getCatalog());
    assertEquals(0, dealer.getCatalog().size());
    ElementPlanner planner = new ElementPlanner(wall, dealer);
    assertThrows(IllegalStateException.class, planner::getCombinations);
  }

  @Test
  void testWallTooSmall() {
    Wall wall = new Wall(1);
    Dealer dealer = new Dealer();
    assertNotNull(dealer.getCatalog());
    ElementPlanner planner = new ElementPlanner(wall, dealer);
    assertEquals(0, planner.getCombinations().size());
  }
}
