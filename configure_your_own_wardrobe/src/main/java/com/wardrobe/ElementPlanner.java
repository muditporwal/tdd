package com.wardrobe;

import java.util.ArrayList;
import java.util.List;

public record ElementPlanner(Wall wall, Dealer dealer) {

  public List<List<WardrobeElement>> getCombinations() {
    ArrayList<WardrobeElement> elements = new ArrayList<>();
    ArrayList<List<WardrobeElement>> consolidatedList = new ArrayList<>();
    elements.add(new WardrobeElement(50));
    elements.add(new WardrobeElement(50));
    elements.add(new WardrobeElement(50));
    elements.add(new WardrobeElement(50));
    elements.add(new WardrobeElement(50));
    consolidatedList.add(elements);
    return consolidatedList;
  }
}
