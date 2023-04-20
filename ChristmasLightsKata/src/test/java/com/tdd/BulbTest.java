package com.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BulbTest {

  @Test
  void testInitialState() {
    Bulb b = new Bulb();
    assertEquals(0, b.getState());
  }

  @Test
  void testAfterTurningOnIsOn() {
    Bulb b = new Bulb();
    b.turnOn();
    assertEquals(1, b.getState());
    b.turnOn();
    assertEquals(2, b.getState());
  }

  @Test
  void testAfterTurningOffIsOff() {
    Bulb b = new Bulb();
    b.turnOn();
    assertEquals(1, b.getState());
    b.turnOn();
    assertEquals(2, b.getState());
    b.turnOff();
    assertEquals(1, b.getState());
    b.turnOff();
    assertEquals(0, b.getState());
    b.turnOff();
    assertEquals(0, b.getState());
  }

  @Test
  void toggle() {
    Bulb b = new Bulb();
    b.toggle();
    assertEquals(2, b.getState());
    b.toggle();
    assertEquals(4, b.getState());
    assertTrue(b.isOn());
  }
}
