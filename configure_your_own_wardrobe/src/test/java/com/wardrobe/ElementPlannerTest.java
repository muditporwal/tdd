package com.wardrobe;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
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
    ArrayList<WardrobeElement> elements50 = new ArrayList<>();
    elements50.add(new WardrobeElement(50));
    elements50.add(new WardrobeElement(50));
    elements50.add(new WardrobeElement(50));
    elements50.add(new WardrobeElement(50));
    elements50.add(new WardrobeElement(50));
    ArrayList<WardrobeElement> elements50n100 = new ArrayList<>();
    elements50n100.add(new WardrobeElement(100));
    elements50n100.add(new WardrobeElement(100));
    elements50n100.add(new WardrobeElement(50));

    assertNotNull(planner.getCombinations());
    assertTrue(planner.getCombinations().contains(elements50n100));
    assertTrue(planner.getCombinations().contains(elements50));
    assertEquals(50, planner.getCombinations().size());
  }
}
