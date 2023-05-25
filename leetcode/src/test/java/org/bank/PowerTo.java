package org.bank;

class PowerTo {
  public static double myPow(double v, int i) {
    if(i==0) return 1;
    if(i==1) return v;
    if(i>0) {
        double powm1 = myPow(v, i - 1);
        return powm1 * powm1;
    }
    return 0;
  }
}
