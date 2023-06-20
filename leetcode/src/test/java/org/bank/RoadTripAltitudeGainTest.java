package org.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RoadTripAltitudeGainTest {

  @Test
  void testNoGainShouldReturn0() {
    int[] gain = new int[0];
    int largestAltitude = RoadTripAltitudeGain.largestAltitude(gain);
    assertEquals(0, largestAltitude);
  }

  @Test
  void testSinglePositiveGainShouldReturnGainValue() {
    int[] gain = new int[1];
    gain[0] = 4;
    int largestAltitude = RoadTripAltitudeGain.largestAltitude(gain);
    assertEquals(gain[0], largestAltitude);
  }

  @Test
  void testSingleNegativeGainShouldReturn0() {
    int[] gain = new int[1];
    gain[0] = -4;
    int largestAltitude = RoadTripAltitudeGain.largestAltitude(gain);
    assertEquals(0, largestAltitude);
  }

  @Test
  void testMultiplePositiveGainShouldReturnSumValue() {
    int[] gain = new int[] {1, 2};
    int largestAltitude = RoadTripAltitudeGain.largestAltitude(gain);
    assertEquals(3, largestAltitude);
  }

  @Test
  void testMultipleNegativeGainShouldReturn0() {
    int[] gain = new int[] {-1, -2};
    int largestAltitude = RoadTripAltitudeGain.largestAltitude(gain);
    assertEquals(0, largestAltitude);
  }
}
