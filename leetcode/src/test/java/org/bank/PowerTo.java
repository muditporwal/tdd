package org.bank;

class PowerTo {
  public static double myPow(double v, int i) {
    if (v == 0) return 0;
    if (i == 0) return 1;
    if (i == 1) return v;
    if (i == -1) return 1/v;
    double pow1;
    if (i > 0) pow1 = myPow(v, i - 1);
    else pow1 = myPow(v, i + 1);
    return pow1 * pow1;
  }
}
