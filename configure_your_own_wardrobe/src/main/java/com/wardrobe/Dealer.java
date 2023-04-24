package com.wardrobe;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

  List<WardrobeElement> catalog;

  public Dealer() {
    this.catalog = initCatalog();
  }

  private List<WardrobeElement> initCatalog() {
    List<WardrobeElement> catalog = new ArrayList<>();
    catalog.add(new WardrobeElement(50));
    catalog.add(new WardrobeElement(75));
    catalog.add(new WardrobeElement(100));
    catalog.add(new WardrobeElement(120));
    return catalog;
  }

  public List<WardrobeElement> getCatalog() {
    return catalog;
  }
}
