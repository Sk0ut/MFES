package Jungle.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class SETUPQuote {
  private static int hc = 0;
  private static SETUPQuote instance = null;

  public SETUPQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static SETUPQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new SETUPQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof SETUPQuote;
  }

  public String toString() {

    return "<SETUP>";
  }
}
