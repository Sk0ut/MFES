package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class ElephantPiece extends Piece {
  public static final String TYPE = "ElephantPiece";
  public static final Number RANK = 8L;

  public void cg_init_ElephantPiece_1(final Object ow) {

    cg_init_Piece_1(ElephantPiece.TYPE, ((Object) ow), ElephantPiece.RANK);
  }

  public ElephantPiece(final Object ow) {

    cg_init_ElephantPiece_1(ow);
  }

  public ElephantPiece() {}

  public String toString() {

    return "ElephantPiece{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", RANK = "
        + Utils.toString(RANK)
        + "}";
  }
}
