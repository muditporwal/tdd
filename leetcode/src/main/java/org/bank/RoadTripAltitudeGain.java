package org.bank;

class RoadTripAltitudeGain {
  public static int largestAltitude(int[] gain) {
    if (gain.length == 0) return 0;
    else {
        if(gain[0] < 0) return 0;
        else return gain[0];
    }
  }
}
