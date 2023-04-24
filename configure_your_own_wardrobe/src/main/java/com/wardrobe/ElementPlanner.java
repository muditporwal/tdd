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
    ArrayList<WardrobeElement> elements50n100 = new ArrayList<>();
    elements50n100.add(new WardrobeElement(100));
    elements50n100.add(new WardrobeElement(100));
    elements50n100.add(new WardrobeElement(50));
    consolidatedList.add(elements50n100);
    return consolidatedList;
  }
}
