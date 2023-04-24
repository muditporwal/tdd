package com.wardrobe;

public class ElementPlanner {

  private final Wall wall;
  private final Dealer dealer;

  public ElementPlanner(Wall wall, Dealer dealer) {
    this.wall = wall;
    this.dealer = dealer;
  }

  public Wall getWall() {
    return this.wall;
  }

  public Dealer getDealer() {
    return this.dealer;
  }
}
