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
      int remainingLenghth = wall.lengthInCms();
      if (remainingLenghth < wardrobeElement.lengthInCms()) {
        continue;
      } else {
        remainingLenghth = remainingLenghth - wardrobeElement.lengthInCms();
        accumulator.add(wardrobeElement);
      }
      if (remainingLenghth == 0) {
        combinations.add(accumulator);
      }
    }
    return combinations;
  }
}
