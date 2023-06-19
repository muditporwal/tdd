package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RoadTripAltitudeGainTest {

  @Test
  public void testNoGainShouldReturn0() {
    int[] gain = new int[0];
    int largestAltitude = RoadTripAltitudeGain.largestAltitude(gain);
    assertEquals(0, largestAltitude);
  }
}
