package com.wardrobe;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WardrobeTest {

  @Test
  void checkWallIsOfLength() {
    Wall w = new Wall();
    assertEquals(250, w.lengthInCms());
  }
}
