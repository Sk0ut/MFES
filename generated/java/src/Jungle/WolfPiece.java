package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class WolfPiece extends Piece {
  public static final String TYPE = "WolfPiece";
  public static final Number RANK = 4L;

  public void cg_init_WolfPiece_1(final Object ow) {

    cg_init_Piece_1(WolfPiece.TYPE, ((Object) ow), WolfPiece.RANK);
  }

  public WolfPiece(final Object ow) {

    cg_init_WolfPiece_1(ow);
  }

  public WolfPiece() {}

  public String toString() {

    return "WolfPiece{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", RANK = "
        + Utils.toString(RANK)
        + "}";
  }
}
