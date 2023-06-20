package org.bank;

class RoadTripAltitudeGain {
  private RoadTripAltitudeGain() {}

  public static int largestAltitude(int[] gain) {
    if (gain.length == 0) return 0;
    else {
      return largestGain(gain, 0, 0, 0);
    }
  }

  private static int largestGain(int[] gain, int index, int currentAltitude, int largestAltitude) {
    if (gain.length == index) return largestAltitude;
    int presentAltitude = gain[index] + currentAltitude;
    if (presentAltitude > largestAltitude)
      return largestGain(gain, ++index, presentAltitude, presentAltitude);
    else return largestGain(gain, ++index, presentAltitude, largestAltitude);
  }
}
