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
    return getCombinations(wall.lengthInCms(), combinations, catalog);
  }

  private ArrayList<List<WardrobeElement>> getCombinations(
      int remainingLength,
      ArrayList<List<WardrobeElement>> combinations,
      List<WardrobeElement> catalog) {

    for (WardrobeElement wardrobeElement : catalog) {
      List<WardrobeElement> accumulator = new ArrayList<>();
      if (remainingLength < wardrobeElement.lengthInCms()) {
        continue;
      } else {
        remainingLength = remainingLength - wardrobeElement.lengthInCms();
        accumulator.add(wardrobeElement);
      }
      if (remainingLength == 0) {
        combinations.add(accumulator);
      }
    }
    return combinations;
  }
}
