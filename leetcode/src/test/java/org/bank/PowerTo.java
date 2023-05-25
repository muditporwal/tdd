package org.bank;

class PowerTo {
  public static double myPow(double x, int n) {
    if (x == 0) return 0;
    if (n == 0) return 1;
    if (n == 1) return x;
    if (n == -1) return 1 / x;
    double pow1;
    if (n > 0) return x * myPow(x, n - 1);
    else return 1 / x * myPow(x, n + 1);
  }
}
