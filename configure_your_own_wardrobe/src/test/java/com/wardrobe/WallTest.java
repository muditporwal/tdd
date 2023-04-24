package com.wardrobe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WallTest {
  @Test
  void checkWall() {
    Wall w = new Wall(250);
    assertEquals(250, w.lengthInCms());
  }
}
