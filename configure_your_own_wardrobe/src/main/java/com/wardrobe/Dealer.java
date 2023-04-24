package com.wardrobe;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

  List<WardrobeElement> catalog;

  public Dealer() {
    this.catalog = initCatalog();
  }

  private List<WardrobeElement> initCatalog() {
    List<WardrobeElement> newCatalog = new ArrayList<>();
    newCatalog.add(new WardrobeElement(50));
    newCatalog.add(new WardrobeElement(75));
    newCatalog.add(new WardrobeElement(100));
    newCatalog.add(new WardrobeElement(120));
    return newCatalog;
  }

  public List<WardrobeElement> getCatalog() {
    return catalog;
  }
}
