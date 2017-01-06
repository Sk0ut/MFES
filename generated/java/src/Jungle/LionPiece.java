package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class LionPiece extends Piece {
  public static final String TYPE = "LionPiece";
  public static final Number RANK = 7L;

  public void cg_init_LionPiece_1(final Object ow) {

    cg_init_Piece_1(LionPiece.TYPE, ((Object) ow), LionPiece.RANK);
  }

  public LionPiece(final Object ow) {

    cg_init_LionPiece_1(ow);
  }

  public LionPiece() {}

  public String toString() {

    return "LionPiece{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", RANK = "
        + Utils.toString(RANK)
        + "}";
  }
}
