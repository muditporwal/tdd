package com.wardrobe;

import java.util.*;

public record ElementCombinations(List<WardrobeElement> elements) {
  public static List<ElementCombinations> getCombinations(
      List<WardrobeElement> catalog, int length) {
    if (length == 0) throw new IllegalArgumentException("length must not be 0 or negative");
    return catalog.stream()
        .map(
            wardrobeElement -> {
              if (wardrobeElement.lengthInCms() == length) {
                List<ElementCombinations> elementCombinations = new ArrayList<>();
                List<WardrobeElement> wardrobeElements = new ArrayList<>();
                wardrobeElements.add(wardrobeElement);
                elementCombinations.add(new ElementCombinations(wardrobeElements));
                return elementCombinations;
              } else if (wardrobeElement.lengthInCms() < length) {
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
