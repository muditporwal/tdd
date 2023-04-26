package com.wardrobe;

import java.util.*;

public record ElementCombinations(List<WardrobeElement> elements) {

  public static List<ElementCombinations> getCombinations(Wall wall, Dealer dealer) {
    List<WardrobeElement> catalog = dealer.getCatalog();
    if (catalog == null || catalog.isEmpty()) {
      throw new IllegalStateException("Dealer has no catalog");
    }
    if (wall.lengthInCms() <= 0) {
      throw new IllegalStateException("Wall length is 0 or less");
    }
    return ElementCombinations.getCombinations(dealer.getCatalog(), wall.lengthInCms());
  }

  public static List<ElementCombinations> getCombinations(
      List<WardrobeElement> catalog, int length) {
    // negative check
    if (length == 0) throw new IllegalArgumentException("length must not be 0 or negative");

    return catalog.stream()
        .map(
            wardrobeElement -> {
              // initial condition
              if (wardrobeElement.lengthInCms() == length) {
                List<ElementCombinations> elementCombinations = new ArrayList<>();
                List<WardrobeElement> wardrobeElements = new ArrayList<>();
                wardrobeElements.add(wardrobeElement);
                elementCombinations.add(new ElementCombinations(wardrobeElements));
                return elementCombinations;
              } else if (wardrobeElement.lengthInCms() < length) {
                // base condition
                int nlength = length - wardrobeElement.lengthInCms();
                List<ElementCombinations> combinations =
                    ElementCombinations.getCombinations(catalog, nlength);
                combinations.forEach(
                    combinationsLocal -> combinationsLocal.elements.add(wardrobeElement));
                return combinations;
              } else {
                return null;
              }
            })
        .filter(Objects::nonNull)
        .flatMap(Collection::stream)
        .toList();
  }
}
