package com.wardrobe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElementPlannerTest {

  @Test
  void testElementPlannerInitialization() {
    Wall wall = new Wall(250);
    Dealer dealer = new Dealer();
    ElementPlanner planner = new ElementPlanner(wall, dealer);
    assertEquals(wall.lengthInCms(), planner.getWall().lengthInCms());
    assertEquals(4,dealer.getCatalog().size());
  }
}
