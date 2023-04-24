package com.wardrobe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WardrobeTest {

  @Test
  void checkWallIsOfLength() {
    Wall w = new Wall(250);
    assertEquals(250, w.lengthInCms());
  }
}
