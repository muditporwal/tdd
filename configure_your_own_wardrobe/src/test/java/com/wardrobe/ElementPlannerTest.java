package com.wardrobe;

import org.junit.jupiter.api.Test;

public class ElementPlannerTest {

  @Test
  void testElementPlannerInitialization() {
    Wall wall = new Wall(250);
    Dealer dealer = new Dealer();
    ElementPlanner planner = new ElementPlanner(wall, dealer);
  }
}
