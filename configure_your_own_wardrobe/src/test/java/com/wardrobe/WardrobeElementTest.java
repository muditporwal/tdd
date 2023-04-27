package com.wardrobe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WardrobeElementTest {

  @Test
  void checkWardrobeElement() {
    WardrobeElement element50 = new WardrobeElement(50);
    assertEquals(50, element50.lengthInCms());
  }

  /* - Catalog does not have the number of items */
  // Catalg does not have price
  @Test
  void checkWardrobeElementWithPrice() {
    WardrobeElement element50 = new WardrobeElement(50);
    assertEquals(59, element50.costInUSD());
  }
}
