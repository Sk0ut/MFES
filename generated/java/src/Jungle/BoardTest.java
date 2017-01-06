package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class BoardTest extends TestCase {
  public void testStepMove() {

    Board board = new Board();
    VDMSeq src = SeqUtil.seq(2L, 6L);
    VDMSeq dest = SeqUtil.seq(3L, 6L);
    Piece mousePiece = ((Piece) Utils.get(board.pieces, src));
    board.startGame();
    assertEqual(mousePiece.type, RatPiece.TYPE);
    assertEqual(((Object) mousePiece.owner), Jungle.quotes.PLAYER1Quote.getInstance());
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), mousePiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
  }

  public void testStepMoveToOwnDenBlocked() {

    VDMSeq src = SeqUtil.seq(0L, 2L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new RatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                SeqUtil.seq(6L, 6L), new ElephantPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    VDMSeq dest = SeqUtil.seq(0L, 3L);
    Piece ratPiece = ((Piece) Utils.get(board.pieces, src));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, DenTile.TYPE);
    assertEqual(((Object) ((Tile) Utils.get(board.tiles, dest)).owner), ((Object) ratPiece.owner));
    assertTrue(!(board.validMove(Utils.copy(src), Utils.copy(dest))));
  }

  public void testSwimMoveInWater() {

    VDMSeq src = SeqUtil.seq(3L, 5L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new RatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                SeqUtil.seq(6L, 6L), new ElephantPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    VDMSeq dest = SeqUtil.seq(4L, 5L);
    Piece mousePiece = ((Piece) Utils.get(board.pieces, src));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, src)).type, WaterTile.TYPE);
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, WaterTile.TYPE);
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), mousePiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
  }

  public void testSwimMoveToWater() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new RatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                SeqUtil.seq(6L, 6L), new ElephantPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    VDMSeq dest = SeqUtil.seq(3L, 5L);
    Piece mousePiece = ((Piece) Utils.get(board.pieces, src));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, src)).type, PlainTile.TYPE);
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, WaterTile.TYPE);
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), mousePiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
  }

  public void testSwimMoveFromWater() {

    VDMSeq src = SeqUtil.seq(3L, 5L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new RatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                SeqUtil.seq(6L, 6L), new ElephantPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    VDMSeq dest = SeqUtil.seq(2L, 5L);
    Piece mousePiece = ((Piece) Utils.get(board.pieces, src));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, src)).type, WaterTile.TYPE);
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, PlainTile.TYPE);
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), mousePiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
  }

  public void testJumpMoveVertical() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new LionPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                SeqUtil.seq(6L, 6L), new ElephantPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    VDMSeq dest = SeqUtil.seq(6L, 5L);
    Piece lionPiece = ((Piece) Utils.get(board.pieces, src));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, src)).type, PlainTile.TYPE);
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, PlainTile.TYPE);
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), lionPiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
  }

  public void testJumpMoveHorizontal() {

    VDMSeq src = SeqUtil.seq(3L, 0L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new LionPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                SeqUtil.seq(6L, 6L), new ElephantPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    VDMSeq dest = SeqUtil.seq(3L, 3L);
    Piece lionPiece = ((Piece) Utils.get(board.pieces, src));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, src)).type, PlainTile.TYPE);
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, PlainTile.TYPE);
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), lionPiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
  }

  public void testJumpMoveBlocked() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new LionPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                SeqUtil.seq(4L, 5L), new RatPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    VDMSeq dest = SeqUtil.seq(6L, 5L);
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, src)).type, PlainTile.TYPE);
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, PlainTile.TYPE);
    assertTrue(!(board.validMove(Utils.copy(src), Utils.copy(dest))));
  }

  public void testCapture() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMSeq dest = SeqUtil.seq(2L, 6L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new LionPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(Utils.copy(dest), new DogPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    Piece lionPiece = ((Piece) Utils.get(board.pieces, src));
    Piece dogPiece = ((Piece) Utils.get(board.pieces, dest));
    board.startGame();
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), lionPiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
    assertTrue(!(SetUtil.inSet(dogPiece, MapUtil.rng(board.pieces))));
  }

  public void testCaptureAfterJump() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMSeq dest = SeqUtil.seq(6L, 5L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new LionPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(Utils.copy(dest), new RatPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    Piece lionPiece = ((Piece) Utils.get(board.pieces, src));
    Piece ratPiece = ((Piece) Utils.get(board.pieces, dest));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, src)).type, PlainTile.TYPE);
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, PlainTile.TYPE);
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), lionPiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
    assertTrue(!(SetUtil.inSet(ratPiece, MapUtil.rng(board.pieces))));
  }

  public void testCaptureDefenderWin() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMSeq dest = SeqUtil.seq(2L, 6L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new RatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(Utils.copy(dest), new DogPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    Piece ratPiece = ((Piece) Utils.get(board.pieces, src));
    Piece dogPiece = ((Piece) Utils.get(board.pieces, dest));
    board.startGame();
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), dogPiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
    assertTrue(!(SetUtil.inSet(ratPiece, MapUtil.rng(board.pieces))));
  }

  public void testCaptureRatAndElephant() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMSeq dest = SeqUtil.seq(2L, 6L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new RatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                Utils.copy(dest), new ElephantPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    Piece ratPiece = ((Piece) Utils.get(board.pieces, src));
    Piece elephantPiece = ((Piece) Utils.get(board.pieces, dest));
    board.startGame();
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), ratPiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
    assertTrue(!(SetUtil.inSet(elephantPiece, MapUtil.rng(board.pieces))));
  }

  public void testCaptureSameRank() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMSeq dest = SeqUtil.seq(2L, 6L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new DogPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(Utils.copy(dest), new DogPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    Piece dogPieceAttacker = ((Piece) Utils.get(board.pieces, src));
    Piece dogPieceDefender = ((Piece) Utils.get(board.pieces, dest));
    board.startGame();
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), dogPieceAttacker);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
    assertTrue(!(SetUtil.inSet(dogPieceDefender, MapUtil.rng(board.pieces))));
  }

  public void testCaptureRatInWater() {

    VDMSeq src = SeqUtil.seq(3L, 5L);
    VDMSeq dest = SeqUtil.seq(4L, 5L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new RatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(Utils.copy(dest), new RatPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    Piece ratPieceAttacker = ((Piece) Utils.get(board.pieces, src));
    Piece ratPieceDefender = ((Piece) Utils.get(board.pieces, dest));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, src)).type, WaterTile.TYPE);
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, WaterTile.TYPE);
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), ratPieceAttacker);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
    assertTrue(!(SetUtil.inSet(ratPieceDefender, MapUtil.rng(board.pieces))));
  }

  public void testCaptureHigherRankInTrap() {

    VDMSeq src = SeqUtil.seq(0L, 1L);
    VDMSeq dest = SeqUtil.seq(0L, 2L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new DogPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(Utils.copy(dest), new LionPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    Piece dogPiece = ((Piece) Utils.get(board.pieces, src));
    Piece lionPiece = ((Piece) Utils.get(board.pieces, dest));
    board.startGame();
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, TrapTile.TYPE);
    assertEqual(((Object) ((Tile) Utils.get(board.tiles, dest)).owner), ((Object) dogPiece.owner));
    assertTrue(dogPiece.rank.longValue() < lionPiece.rank.longValue());
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Piece) Utils.get(board.pieces, dest)), dogPiece);
    assertTrue(!(SetUtil.inSet(src, MapUtil.dom(board.pieces))));
    assertTrue(!(SetUtil.inSet(lionPiece, MapUtil.rng(board.pieces))));
  }

  public void testWinByArrivingToDen() {

    VDMSeq src = SeqUtil.seq(8L, 2L);
    VDMSeq dest = SeqUtil.seq(8L, 3L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new DogPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(
                SeqUtil.seq(6L, 6L), new DogPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    board.startGame();
    assertEqual(((Object) board.state), Jungle.quotes.PLAYQuote.getInstance());
    assertEqual(((Tile) Utils.get(board.tiles, dest)).type, DenTile.TYPE);
    assertEqual(
        ((Object) ((Tile) Utils.get(board.tiles, dest)).owner),
        Jungle.quotes.PLAYER2Quote.getInstance());
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Object) board.state), Jungle.quotes.ENDQuote.getInstance());
    assertEqual(((Object) board.winner), Jungle.quotes.PLAYER1Quote.getInstance());
  }

  public void testWinByCapturingAllPieces() {

    VDMSeq src = SeqUtil.seq(2L, 5L);
    VDMSeq dest = SeqUtil.seq(2L, 6L);
    VDMMap pieces =
        MapUtil.map(
            new Maplet(Utils.copy(src), new LionPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
            new Maplet(Utils.copy(dest), new DogPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
    Board board = new Board(Utils.copy(pieces));
    board.startGame();
    board.play(Utils.copy(src), Utils.copy(dest));
    assertEqual(((Object) board.state), Jungle.quotes.ENDQuote.getInstance());
    assertEqual(((Object) board.winner), Jungle.quotes.PLAYER1Quote.getInstance());
    Boolean existsExpResult_2 = false;
    VDMSet set_2 = MapUtil.rng(board.pieces);
    for (Iterator iterator_2 = set_2.iterator(); iterator_2.hasNext() && !(existsExpResult_2); ) {
      Piece piece = ((Piece) iterator_2.next());
      existsExpResult_2 = Utils.equals(piece.owner, Jungle.quotes.PLAYER2Quote.getInstance());
    }
    assertTrue(!(existsExpResult_2));
  }

  public void testAll() {

    IO.println("StepMove");
    testStepMove();
    testStepMoveToOwnDenBlocked();
    IO.println("SwimMove");
    testSwimMoveInWater();
    testSwimMoveToWater();
    testSwimMoveFromWater();
    IO.println("JumpMove");
    testJumpMoveVertical();
    testJumpMoveHorizontal();
    testJumpMoveBlocked();
    IO.println("Capture");
    testCapture();
    testCaptureAfterJump();
    testCaptureDefenderWin();
    testCaptureRatAndElephant();
    testCaptureSameRank();
    testCaptureRatInWater();
    testCaptureHigherRankInTrap();
    IO.println("Win conditions");
    testWinByArrivingToDen();
    testWinByCapturingAllPieces();
    IO.println("All tests passed");
  }

  public static void main() {

    new BoardTest().testAll();
  }

  public BoardTest() {}

  public String toString() {

    return "BoardTest{}";
  }
}
