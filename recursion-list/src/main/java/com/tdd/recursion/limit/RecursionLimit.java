package com.tdd.recursion.limit;

class RecursionLimit {

  private long limit;

  public long fetchLimit() {
    return limit;
  }

  public void setLimit(long i) {
    this.limit = i;
  }

  public long testLimit(long executionRange) {
    recursiveFunction(0L, executionRange, limit);
    return executionRange;
  }

  private void recursiveFunction(long recursionLevel, long executionRange, long limit) {

    System.out.println("Current Recursion Frame : " + recursionLevel);
    if (recursionLevel == executionRange) return; // Base Condition
    if (recursionLevel == limit && recursionLevel < executionRange) {
      throw new RuntimeException("ExecutionRange Out of bounds of the set frame limit");
    } else {
      recursiveFunction(recursionLevel + 1, executionRange, limit);
    }
  }
}
