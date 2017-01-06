package Jungle.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PLAYER2Quote {
  private static int hc = 0;
  private static PLAYER2Quote instance = null;

  public PLAYER2Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static PLAYER2Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new PLAYER2Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof PLAYER2Quote;
  }

  public String toString() {

    return "<PLAYER2>";
  }
}
