package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class JumpMove extends Move {
  public static final String TYPE = "Jump";
  public static final VDMSet PIECES = SetUtil.set(LionPiece.TYPE, TigerPiece.TYPE);

  public void cg_init_JumpMove_1() {

    cg_init_Move_1(JumpMove.TYPE, Utils.copy(JumpMove.PIECES));
  }

  public JumpMove() {

    cg_init_JumpMove_1();
  }

  public Boolean validMove(final Board board, final VDMSeq src, final VDMSeq dest) {

    Piece piece = ((Piece) Utils.get(board.pieces, src));
    Tile srcTile = ((Tile) Utils.get(board.tiles, src));
    Tile destTile = ((Tile) Utils.get(board.tiles, dest));
    if (!(SetUtil.inSet(piece.type, this.allowedPieces))) {
      return false;
    }

    Boolean orResult_1 = false;

    if (Utils.equals(srcTile.type, WaterTile.TYPE)) {
      orResult_1 = true;
    } else {
      orResult_1 = Utils.equals(destTile.type, WaterTile.TYPE);
    }

    if (orResult_1) {
      return false;
    }

    if (sameCol(Utils.copy(src), Utils.copy(dest))) {
      Number col = ((Number) Utils.get(src, Board.COL));
      if (((Number) Utils.get(src, Board.ROW)).longValue()
          < ((Number) Utils.get(dest, Board.ROW)).longValue()) {
        for (Iterator iterator_6 =
                SetUtil.range(
                        ((Number) Utils.get(src, Board.ROW)).longValue() + 1L,
                        ((Number) Utils.get(dest, Board.ROW)).longValue() - 1L)
                    .iterator();
            iterator_6.hasNext();
            ) {
          Number row = (Number) iterator_6.next();
          Boolean orResult_2 = false;

          if (!(Utils.equals(
              ((Tile) Utils.get(board.tiles, SeqUtil.seq(row, col))).type, WaterTile.TYPE))) {
            orResult_2 = true;
          } else {
            orResult_2 = SetUtil.inSet(SeqUtil.seq(row, col), MapUtil.dom(board.pieces));
          }

          if (orResult_2) {
            return false;
          }
        }

      } else {
        for (Iterator iterator_7 =
                SetUtil.range(
                        ((Number) Utils.get(dest, Board.ROW)).longValue() + 1L,
                        ((Number) Utils.get(src, Board.ROW)).longValue() - 1L)
                    .iterator();
            iterator_7.hasNext();
            ) {
          Number row = (Number) iterator_7.next();
          Boolean orResult_3 = false;

          if (!(Utils.equals(
              ((Tile) Utils.get(board.tiles, SeqUtil.seq(row, col))).type, WaterTile.TYPE))) {
            orResult_3 = true;
          } else {
            orResult_3 = SetUtil.inSet(SeqUtil.seq(row, col), MapUtil.dom(board.pieces));
          }

          if (orResult_3) {
            return false;
          }
        }
      }

    } else if (sameRow(Utils.copy(src), Utils.copy(dest))) {
      Number row = ((Number) Utils.get(src, Board.ROW));
      if (((Number) Utils.get(src, Board.COL)).longValue()
          < ((Number) Utils.get(dest, Board.COL)).longValue()) {
        for (Iterator iterator_8 =
                SetUtil.range(
                        ((Number) Utils.get(src, Board.COL)).longValue() + 1L,
                        ((Number) Utils.get(dest, Board.COL)).longValue() - 1L)
                    .iterator();
            iterator_8.hasNext();
            ) {
          Number col = (Number) iterator_8.next();
          Boolean orResult_4 = false;

          if (!(Utils.equals(
              ((Tile) Utils.get(board.tiles, SeqUtil.seq(row, col))).type, WaterTile.TYPE))) {
            orResult_4 = true;
          } else {
            orResult_4 = SetUtil.inSet(SeqUtil.seq(row, col), MapUtil.dom(board.pieces));
          }

          if (orResult_4) {
            return false;
          }
        }

      } else {
        for (Iterator iterator_9 =
                SetUtil.range(
                        ((Number) Utils.get(dest, Board.COL)).longValue() + 1L,
                        ((Number) Utils.get(src, Board.COL)).longValue() - 1L)
                    .iterator();
            iterator_9.hasNext();
            ) {
          Number col = (Number) iterator_9.next();
          Boolean orResult_5 = false;

          if (!(Utils.equals(
              ((Tile) Utils.get(board.tiles, SeqUtil.seq(row, col))).type, WaterTile.TYPE))) {
            orResult_5 = true;
          } else {
            orResult_5 = SetUtil.inSet(SeqUtil.seq(row, col), MapUtil.dom(board.pieces));
          }

          if (orResult_5) {
            return false;
          }
        }
      }
    }

    return true;
  }

  public String toString() {

    return "JumpMove{"
        + "TYPE = "
        + Utils.toString(TYPE)
        + ", PIECES = "
        + Utils.toString(PIECES)
        + "}";
  }
}
