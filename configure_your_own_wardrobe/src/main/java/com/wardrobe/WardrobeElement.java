package com.wardrobe;

import java.util.HashMap;

public record WardrobeElement(int lengthInCms) {

  private static final HashMap<Integer, Integer> costMap = new HashMap<>();

  static {
    costMap.put(50, 59);
    costMap.put(75, 62);
    costMap.put(100, 90);
    costMap.put(120, 111);
  }

  public int costInUSD() {
    return costMap.getOrDefault(lengthInCms, 1000);
  }
}
