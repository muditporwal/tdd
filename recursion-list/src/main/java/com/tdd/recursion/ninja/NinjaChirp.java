package com.tdd.recursion.ninja;

public class NinjaChirp {

  public static final String CHIRP = "chirp";
  public static final String QUIET = "";
  public static final String CHIRP_CODE = "chirp-";

  public String canChirp(int i) {
    if (i <= -1) throw new IllegalArgumentException("A ninja cannot understand this!");
    if (i == 0) return QUIET;
    if (i == 1) return CHIRP;
    return CHIRP_CODE + canChirp(i - 1);
  }
}
