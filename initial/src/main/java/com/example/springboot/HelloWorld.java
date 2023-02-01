package com.example.springboot;

import com.google.common.flogger.FluentLogger;

public class HelloWorld {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();
  transient int nval;
  private static int AAA = 1;

  /**
   * sam.
   *
   * @param a dummy comment
   */
  public HelloWorld(int a) {
    if (a == 0) {
      logger.atInfo().log("");
    } else if (a == AAA) {
      logger.atInfo().log("");
    }
    this.nval = a;

    logger.atInfo().log("nval: %d", this.nval);
  }

  // @Override
  // public boolean equals(Object o) {
  //   if (!(o instanceof HelloWorld)) {
  //     return false;
  //   }
  //   return ((HelloWorld) o).nval == nval;
  // }
}
