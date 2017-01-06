package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TigerPiece extends Piece {
  public static final String TYPE = "TigerPiece";
  public static final Number RANK = 6L;

  public void cg_init_TigerPiece_1(final Object ow) {

    cg_init_Piece_1(TigerPiece.TYPE, ((Object) ow), TigerPiece.RANK);
  }

  public TigerPiece(final Object ow) {

    cg_init_TigerPiece_1(ow);
  }

  public TigerPiece() {}

  public String toString() {

    return "TigerPiece{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", RANK = "
        + Utils.toString(RANK)
        + "}";
  }
}
