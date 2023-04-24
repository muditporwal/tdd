package com.wardrobe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WardrobeTest {

  @Test
  void checkWallIsOfLength() {
    Wall w = new Wall(250);
    assertEquals(250, w.lengthInCms());
  }

  @Test
  void checkElementsOfWardrobe() {
    WardrobeElement element50 = new WardrobeElement();
    assertEquals(50, element50.lengthInCms());
  }
}
