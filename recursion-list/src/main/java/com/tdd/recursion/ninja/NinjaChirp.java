package com.tdd.recursion.ninja;

public class NinjaChirp {

  public static final String CHIRP = "chirp";

  public String canChirp(int i) {
    if (i <= -1) throw new IllegalArgumentException("A ninja cannot understand this!");
    if (i == 1) return CHIRP;
    return null;
  }
}
