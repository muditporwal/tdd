package com.wardrobe;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record ElementCombinations(List<WardrobeElement> elements) {
  public static List<ElementCombinations> getCombinations(
      List<WardrobeElement> catalog, int length) {
    return catalog.stream()
        .map(
            wardrobeElement -> {
              if (wardrobeElement.lengthInCms() == length) {
                ElementCombinations elComb = new ElementCombinations(new ArrayList<>());
                elComb.elements.add(wardrobeElement);
                return elComb;
              }
              return null;
            })
        .filter(Objects::nonNull)
        .toList();
  }
}
