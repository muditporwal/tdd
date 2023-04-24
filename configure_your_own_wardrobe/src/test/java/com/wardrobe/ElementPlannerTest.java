package com.wardrobe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementPlannerTest {

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
  void testCombinationGettingForWardrobes() {
    assertNotNull(planner.getCombinations());
    assertEquals(50, planner.getCombinations().size());
  }
}
