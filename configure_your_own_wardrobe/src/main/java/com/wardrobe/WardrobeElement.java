package com.wardrobe;

public record WardrobeElement(int lengthInCms) {
  public int costInUSD() {
    if (lengthInCms == 50) return 59;
    else if (lengthInCms == 75) return 62;
    return 100;
  }
}
