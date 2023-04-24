package com.wardrobe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class DealerTest {
  @Test
  void checkDealerOptions() {
    Dealer dealer = new Dealer();
    List<WardrobeElement> catalog = dealer.getCatalog();
    assertEquals(4, catalog.size());
  }
}
