package Jungle.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PLAYER1Quote {
  private static int hc = 0;
  private static PLAYER1Quote instance = null;

  public PLAYER1Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static PLAYER1Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new PLAYER1Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof PLAYER1Quote;
  }

  public String toString() {

    return "<PLAYER1>";
  }
}
