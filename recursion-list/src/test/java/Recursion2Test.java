import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Recursion2Test {

  /*
      i) If a = 0 or b = 0, return [a,b]. Otherwise, go to step (ii);
      ii) If a ≥ 2*b, set a = a - 2*b, and repeat step (i). Otherwise, go to step (iii);
      iii) If b ≥ 2*a, set b = b - 2*a, and repeat step (i). Otherwise, return [a,b].
      a and b will both be lower than 10E8.
  */
  @Test
  void testCreateABRecord() {
    ABRecord a = new ABRecord();
    assertEquals(0, a.getA());
    assertEquals(0, a.getB());
  }
}
