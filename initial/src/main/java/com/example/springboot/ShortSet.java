package com.example.springboot;

import com.google.common.flogger.FluentLogger;
import java.util.HashSet;
import java.util.Set;

public class ShortSet {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  public static void main(String[] args) {
    Set<Short> s = new HashSet<>();
    for (short i = 0; i < 100; i++) {
      s.add(i);
      // s.remove(i - 1);
    }
    logger.atInfo().log("size: %d", s.size());
  }
}
