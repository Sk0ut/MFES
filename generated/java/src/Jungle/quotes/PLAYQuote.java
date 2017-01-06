package Jungle.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PLAYQuote {
  private static int hc = 0;
  private static PLAYQuote instance = null;

  public PLAYQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static PLAYQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new PLAYQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof PLAYQuote;
  }

  public String toString() {

    return "<PLAY>";
  }
}
