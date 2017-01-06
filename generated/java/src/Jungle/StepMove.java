package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class StepMove extends Move {
  public static final String TYPE = "Step";
  public static final VDMSet PIECES =
      SetUtil.set(
          CatPiece.TYPE,
          DogPiece.TYPE,
          ElephantPiece.TYPE,
          LeopardPiece.TYPE,
          LionPiece.TYPE,
          RatPiece.TYPE,
          TigerPiece.TYPE,
          WolfPiece.TYPE);

  public void cg_init_StepMove_1() {

    cg_init_Move_1(StepMove.TYPE, Utils.copy(StepMove.PIECES));
  }

  public StepMove() {

    cg_init_StepMove_1();
  }

  public Boolean validMove(final Board board, final VDMSeq src, final VDMSeq dest) {

    Piece piece = ((Piece) Utils.get(board.pieces, src));
    Tile srcTile = ((Tile) Utils.get(board.tiles, src));
    Tile destTile = ((Tile) Utils.get(board.tiles, dest));
    if (!(SetUtil.inSet(piece.type, this.allowedPieces))) {
      return false;
    }

    if (!(adjacentTiles(Utils.copy(src), Utils.copy(dest)))) {
      return false;
    }

    Boolean orResult_7 = false;

    if (Utils.equals(srcTile.type, WaterTile.TYPE)) {
      orResult_7 = true;
    } else {
      orResult_7 = Utils.equals(destTile.type, WaterTile.TYPE);
    }

    if (orResult_7) {
      return false;
    }

    Boolean andResult_27 = false;

    if (Utils.equals(destTile.type, DenTile.TYPE)) {
      if (Utils.equals(destTile.owner, piece.owner)) {
        andResult_27 = true;
      }
    }

    if (andResult_27) {
      return false;
    }

    return true;
  }

  public String toString() {

    return "StepMove{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", PIECES = "
        + Utils.toString(PIECES)
        + "}";
  }
}
