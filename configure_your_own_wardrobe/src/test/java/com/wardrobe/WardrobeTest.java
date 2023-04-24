package com.wardrobe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class WardrobeTest {

  @Test
  void checkWall() {
    Wall w = new Wall(250);
    assertEquals(250, w.lengthInCms());
  }

  @Test
  void checkWardrobeElement() {
    WardrobeElement element50 = new WardrobeElement(50);
    assertEquals(50, element50.lengthInCms());
  }

  @Test
  void checkDealerOptions() {
    Dealer dealer = new Dealer();
    List<WardrobeElement> catalogue = dealer.getCatalogue();
  }
}
