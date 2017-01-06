package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class LeopardPiece extends Piece {
  public static final String TYPE = "LeopardPiece";
  public static final Number RANK = 5L;

  public void cg_init_LeopardPiece_1(final Object ow) {

    cg_init_Piece_1(LeopardPiece.TYPE, ((Object) ow), LeopardPiece.RANK);
  }

  public LeopardPiece(final Object ow) {

    cg_init_LeopardPiece_1(ow);
  }

  public LeopardPiece() {}

  public String toString() {

    return "LeopardPiece{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", RANK = "
        + Utils.toString(RANK)
        + "}";
  }
}
