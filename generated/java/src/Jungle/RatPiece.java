package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class RatPiece extends Piece {
  public static final String TYPE = "RatPiece";
  public static final Number RANK = 1L;

  public void cg_init_RatPiece_1(final Object ow) {

    cg_init_Piece_2(
        RatPiece.TYPE,
        ((Object) ow),
        RatPiece.RANK,
        SetUtil.set("PlainTile", "TrapTile", "DenTile", "WaterTile"));
  }

  public RatPiece(final Object ow) {

    cg_init_RatPiece_1(ow);
  }

  public RatPiece() {}

  public String toString() {

    return "1";
  }
}
