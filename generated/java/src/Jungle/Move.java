package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
abstract public class Move {
  public String type;
  public VDMSet allowedPieces;

  public void cg_init_Move_1(final String argType, final VDMSet argAllowedPieces) {

    type = argType;
    allowedPieces = Utils.copy(argAllowedPieces);
    return;
  }

  public Move(final String argType, final VDMSet argAllowedPieces) {

    cg_init_Move_1(argType, Utils.copy(argAllowedPieces));
  }

  public abstract Boolean validMove(final Board board, final VDMSeq src, final VDMSeq dest);

  public Move() {}

  public static Boolean sameRow(final VDMSeq src, final VDMSeq dest) {

    return Utils.equals(
        ((Number) Utils.get(src, Board.ROW)), ((Number) Utils.get(dest, Board.ROW)));
  }

  public static Boolean sameCol(final VDMSeq src, final VDMSeq dest) {

    return Utils.equals(
        ((Number) Utils.get(src, Board.COL)), ((Number) Utils.get(dest, Board.COL)));
  }

  public static Boolean adjacentTiles(final VDMSeq src, final VDMSeq dest) {

    Boolean orResult_6 = false;

    Boolean andResult_22 = false;

    if (sameRow(Utils.copy(src), Utils.copy(dest))) {
      if (Utils.equals(
          Utils.abs(
              ((Number) Utils.get(dest, Board.COL)).longValue()
                  - ((Number) Utils.get(src, Board.COL)).longValue()),
          1L)) {
        andResult_22 = true;
      }
    }

    if (andResult_22) {
      orResult_6 = true;
    } else {
      Boolean andResult_23 = false;

      if (sameCol(Utils.copy(src), Utils.copy(dest))) {
        if (Utils.equals(
            Utils.abs(
                ((Number) Utils.get(dest, Board.ROW)).longValue()
                    - ((Number) Utils.get(src, Board.ROW)).longValue()),
            1L)) {
          andResult_23 = true;
        }
      }

      orResult_6 = andResult_23;
    }

    return orResult_6;
  }

  public String toString() {

    return "Move{"
        + "type := "
        + Utils.toString(type)
        + ", allowedPieces := "
        + Utils.toString(allowedPieces)
        + "}";
  }
}
