package com.tdd.recursion.ninja;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

public class NinjaChirpTest {

  @Test
  void initializeNinjaChirp() {
    NinjaChirp ninja = new NinjaChirp();
  }

  @Test
  void testIfNinjaCanChirp() {
    NinjaChirp ninja = new NinjaChirp();
    String chirpCode = ninja.canChirp(1);
    assertEquals("chirp", chirpCode);
  }

  @Test
  void testIfNinjaUnderstandsOddRequests() {
    NinjaChirp ninja = new NinjaChirp();
    assertThrowsExactly(IllegalArgumentException.class, () -> ninja.canChirp(-1));
  }
}
