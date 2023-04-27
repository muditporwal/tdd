package com.wardrobe;

import java.util.*;

public record ElementCombinations(TreeSet<WardrobeElement> elements) {

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
              if (wardrobeElement.lengthInCms() == length) {
                return elementCombinationsForMatchedLength(wardrobeElement);
              } else if (wardrobeElement.lengthInCms() < length) {
                return elementCombinationsForMoreWallSpace(catalog, length, wardrobeElement);
              } else {
                return null; // No elementCombination for not matching length
              }
            })
        .filter(Objects::nonNull)
        .flatMap(Collection::stream)
        .distinct()
        .toList();
  }

  private static List<ElementCombinations> elementCombinationsForMoreWallSpace(
      List<WardrobeElement> catalog, int length, WardrobeElement wardrobeElement) {
    int nlength = length - wardrobeElement.lengthInCms();
    List<ElementCombinations> combinations = ElementCombinations.getCombinations(catalog, nlength);
    combinations.forEach(combinationsLocal -> combinationsLocal.elements.add(wardrobeElement));
    return combinations;
  }

  private static List<ElementCombinations> elementCombinationsForMatchedLength(
      WardrobeElement wardrobeElement) {
    List<ElementCombinations> elementCombinations = new ArrayList<>();
    TreeSet<WardrobeElement> wardrobeElements =
        new TreeSet<>(Comparator.comparingInt(WardrobeElement::lengthInCms));
    wardrobeElements.add(wardrobeElement);
    elementCombinations.add(new ElementCombinations(wardrobeElements));
    return elementCombinations;
  }
}
