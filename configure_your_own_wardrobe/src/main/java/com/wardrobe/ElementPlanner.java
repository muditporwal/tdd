package com.wardrobe;

import java.util.ArrayList;
import java.util.List;

public record ElementPlanner(Wall wall, Dealer dealer) {

  public List<List<WardrobeElement>> getCombinations() {
    if (dealer.getCatalog() == null || dealer.getCatalog().isEmpty()) {
      throw new IllegalStateException("Dealer has no catalog");
    }
    return new ArrayList<>();
  }
}
