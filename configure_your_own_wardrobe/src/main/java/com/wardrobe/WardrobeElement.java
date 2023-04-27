package com.wardrobe;

import java.util.HashMap;

public record WardrobeElement(int lengthInCms) {
  public int costInUSD() {
    HashMap<Integer, Integer> costMap = new HashMap<>();
    costMap.put(50, 59);
    costMap.put(75, 62);
    costMap.put(100, 90);
    costMap.put(120, 111);
    return costMap.getOrDefault(lengthInCms, 1000);
  }
}
