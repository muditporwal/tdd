package com.wardrobe;

import java.util.ArrayList;
import java.util.List;

public record ElementPlanner(Wall wall, Dealer dealer) {

  public List<List<WardrobeElement>> getCombinations() {
    List<WardrobeElement> catalog = dealer.getCatalog();
    if (catalog == null || catalog.isEmpty()) {
      throw new IllegalStateException("Dealer has no catalog");
    }
    ArrayList<List<WardrobeElement>> combinations = new ArrayList<>();
    for (WardrobeElement wardrobeElement : catalog) {
      List<WardrobeElement> accumulator = new ArrayList<>();
      if (wall.lengthInCms() < wardrobeElement.lengthInCms()) {
        continue;
      } else {
        accumulator.add(wardrobeElement);
      }
      combinations.add(accumulator);
    }
    return combinations;
  }
}
