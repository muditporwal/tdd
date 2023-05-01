import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Recursion2Test {

  /*
      i) If a = 0 or b = 0, return [a,b]. Otherwise, go to step (ii);
      ii) If a ≥ 2*b, set a = a - 2*b, and repeat step (i). Otherwise, go to step (iii);
      iii) If b ≥ 2*a, set b = b - 2*a, and repeat step (i). Otherwise, return [a,b].
      a and b will both be lower than 10E8.
  */
  @Test
  void testCreateABRecord() {
    ABRecord a = new ABRecord(0, 0);
    assertEquals(0, a.getA());
    assertEquals(0, a.getB());
  }

  @Test
  void testBaseCase() {
    ABRecord a = new ABRecord(0, 0);
    ABRecord b = a.compute();
    assertTrue(b.getA() == 0 || b.getB() == 0);
  }

  @Test
  void testSecondCase() {
    ABRecord a = new ABRecord(12, 6);
    ABRecord b = a.compute();
    assertEquals(0, b.getA());
    assertEquals(6, b.getB());
  }

  @Test
  void testThirdCase() {
    ABRecord a = new ABRecord(6, 12);
    ABRecord b = a.compute();
    assertEquals(6, b.getA());
    assertEquals(0, b.getB());
  }

  @Test
  void testFourthCase() {
    ABRecord a = new ABRecord(3, 4);
    ABRecord b = a.compute();
    assertEquals(3, b.getA());
    assertEquals(4, b.getB());
  }
}
