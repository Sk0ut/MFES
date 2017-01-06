package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class SwimMove extends Move {
  public static final String TYPE = "Swim";
  public static final VDMSet PIECES = SetUtil.set(RatPiece.TYPE);

  public void cg_init_SwimMove_1() {

    cg_init_Move_1(SwimMove.TYPE, Utils.copy(SwimMove.PIECES));
  }

  public SwimMove() {

    cg_init_SwimMove_1();
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

    if (Utils.equals(srcTile.type, PlainTile.TYPE)) {
      Boolean andResult_31 = false;

      if (Utils.equals(destTile.type, WaterTile.TYPE)) {
        if (!(SetUtil.inSet(dest, MapUtil.dom(board.pieces)))) {
          andResult_31 = true;
        }
      }

      return andResult_31;
    }

    if (!(Utils.equals(srcTile.type, WaterTile.TYPE))) {
      return false;
    }

    if (Utils.equals(destTile.type, WaterTile.TYPE)) {
      return true;
    }

    if (Utils.equals(destTile.type, PlainTile.TYPE)) {
      return !(SetUtil.inSet(dest, MapUtil.dom(board.pieces)));
    }

    return false;
  }

  public String toString() {

    return "SwimMove{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", PIECES = "
        + Utils.toString(PIECES)
        + "}";
  }
}
