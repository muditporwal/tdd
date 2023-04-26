package com.wardrobe;

import java.util.List;

public record ElementPlanner(Wall wall, Dealer dealer) {
  public List<ElementCombinations> getCombinations() {
    List<WardrobeElement> catalog = dealer.getCatalog();
    if (catalog == null || catalog.isEmpty()) {
      throw new IllegalStateException("Dealer has no catalog");
    }
    if(wall.lengthInCms()<=0){
      throw new IllegalStateException("Wall length is 0 or less");
    }
    return ElementCombinations.getCombinations(catalog, wall.lengthInCms());
  }
}
