package com.tdd.recursion.ninja;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

class NinjaChirpTest {

  @Test
  void testIfNinjaCanKeepQuiet() {
    NinjaChirp ninja = new NinjaChirp();
    String chirpCode = ninja.canChirp(0);
    assertEquals("", chirpCode);
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

  @Test
  void testIfNinjaCanTalkChirp() {
    NinjaChirp ninja = new NinjaChirp();
    String chirpCode = ninja.canChirp(3);

    assertEquals("chirp-chirp-chirp", chirpCode);
  }
}
