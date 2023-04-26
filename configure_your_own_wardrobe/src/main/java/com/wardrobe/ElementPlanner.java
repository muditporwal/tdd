package com.wardrobe;

import java.util.ArrayList;
import java.util.List;

public record ElementPlanner(Wall wall, Dealer dealer) {
  public List<ElementCombinations> getCombinations() {
    List<WardrobeElement> catalog = dealer.getCatalog();
    if (catalog == null || catalog.isEmpty()) {
      throw new IllegalStateException("Dealer has no catalog");
    }
    List<ElementCombinations> combinations = new ArrayList();

    return combinations;
  }
}
