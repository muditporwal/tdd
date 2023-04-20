package com.tdd;

public class Bulb {
  private int state;

  public Bulb() {
    this.state = 0;
  }

  public int getState() {
    return state;
  }

  public boolean isOn() {
    return state >= 1;
  }

  public void turnOn() {
    state = state + 1;
  }

  public void turnOff() {
    if (state != 0) state = state - 1;
  }

  public boolean isOff() {
    return !isOn();
  }

  public void toggle() {
    state = state + 2;
  }
}
