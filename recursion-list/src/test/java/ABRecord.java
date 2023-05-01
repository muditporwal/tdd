public class ABRecord {
  private final int a;
  private final int b;

  public ABRecord(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public ABRecord compute() {
    if (a == 0 || b == 0) {
      return this;
    }
    return null;
  }
}
