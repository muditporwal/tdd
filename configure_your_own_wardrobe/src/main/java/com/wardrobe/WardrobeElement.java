package com.wardrobe;

public record WardrobeElement(int lengthInCms) {
    public int costInUSD() {
        return 59;
    }
}
