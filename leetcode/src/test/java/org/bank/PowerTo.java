package org.bank;

class PowerTo {
  public static double myPow(double x, int n) {
    if (x == 0) return 0;
    if (n == 0) return 1;
    if (n == 1) return x;
    if (n == -1) return 1 / x;
    double pow1;
    pow1 = myPow(x, n / 2);
    return pow1 * pow1 * myPow(x, n % 2); // myPow(x, 0/1/-1)
  }
}
