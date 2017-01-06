package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class CatPiece extends Piece {
  public static final String TYPE = "CatPiece";
  public static final Number RANK = 2L;

  public void cg_init_CatPiece_1(final Object ow) {

    cg_init_Piece_1(CatPiece.TYPE, ((Object) ow), CatPiece.RANK);
  }

  public CatPiece(final Object ow) {

    cg_init_CatPiece_1(ow);
  }

  public CatPiece() {}

  public String toString() {

    return "CatPiece{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", RANK = "
        + Utils.toString(RANK)
        + "}";
  }
}
