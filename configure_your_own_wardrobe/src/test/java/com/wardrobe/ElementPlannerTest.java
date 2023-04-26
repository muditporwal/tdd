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
  void testInvalidWallLength() {
    Wall wall = new Wall(0);
    ElementPlanner planner = new ElementPlanner(wall, new Dealer());
    assertThrows(
        IllegalStateException.class, planner::getCombinations, "Wall length cannot be 0 or less");
  }
}
