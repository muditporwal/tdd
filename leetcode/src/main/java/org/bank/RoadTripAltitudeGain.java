package org.bank;

class RoadTripAltitudeGain {
  public static int largestAltitude(int[] gain) {
    if (gain.length == 0) return 0;
    else {
      return largestAltitudeWithAccumulation(gain, 0);
    }
  }

  private static int largestAltitudeWithAccumulation(int[] gain, int largestAltitude) {
    if (gain[0] > 0) return gain[0];
    else return 0;
  }
}
