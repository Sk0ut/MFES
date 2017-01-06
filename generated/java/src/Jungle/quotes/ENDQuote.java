package Jungle.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ENDQuote {
  private static int hc = 0;
  private static ENDQuote instance = null;

  public ENDQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static ENDQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new ENDQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof ENDQuote;
  }

  public String toString() {

    return "<END>";
  }
}
