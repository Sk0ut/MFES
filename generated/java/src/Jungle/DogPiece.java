package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DogPiece extends Piece {
  public static final String TYPE = "DogPiece";
  public static final Number RANK = 3L;

  public void cg_init_DogPiece_1(final Object ow) {

    cg_init_Piece_1(DogPiece.TYPE, ((Object) ow), DogPiece.RANK);
  }

  public DogPiece(final Object ow) {

    cg_init_DogPiece_1(ow);
  }

  public DogPiece() {}

  public String toString() {

    return "DogPiece{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", RANK = "
        + Utils.toString(RANK)
        + "}";
  }
}
