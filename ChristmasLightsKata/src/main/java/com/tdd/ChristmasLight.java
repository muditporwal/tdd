package com.tdd;

import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChristmasLight {

  private final Bulb[][] bulbs;
  Logger log = LogManager.getLogger(ChristmasLight.class);

  public ChristmasLight(final int x, final int y) {
    bulbs = new Bulb[x][y];
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        bulbs[i][j] = new Bulb();
      }
    }
  }

  public int bulbsInstalled() {
    return bulbs.length * bulbs[0].length;
  }

  public Bulb getBulb(int x, int y) {
    return bulbs[x][y];
  }

  public void turnOn(int x1, int y1, int x2, int y2) {
    range(x1, y1, x2, y2, Bulb::turnOn);
  }

  public void turnOff(int x1, int y1, int x2, int y2) {
    range(x1, y1, x2, y2, Bulb::turnOff);
  }

  public void toggle(int x1, int y1, int x2, int y2) {
    range(x1, y1, x2, y2, Bulb::toggle);
  }

  private void range(int x1, int y1, int x2, int y2, Consumer<Bulb> method) {
    for (int i = x1; i <= x2; i++) {
      for (int j = y1; j <= y2; j++) {
        method.accept(bulbs[i][j]);
      }
    }
  }

  public void simulate() {
    for (Bulb[] bulb : bulbs) {
      StringBuilder lights = new StringBuilder();
      for (int j = 0; j < bulbs[0].length; j++) {
        lights.append(bulb[j].getState());
      }
      log.info(String.valueOf(lights));
    }
  }

  public int getTotalBrightnessOfBulbs() {
    int count = 0;
    for (Bulb[] bulb : bulbs) {
      for (int j = 0; j < bulbs[0].length; j++) {
        if (bulb[j].isOn()) {
          count++;
        }
      }
    }
    return count;
  }
}
