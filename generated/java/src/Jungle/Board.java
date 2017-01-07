package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Board {
  public static final Number ROW = 1L;
  public static final Number COL = 2L;
  public static final VDMMap DEFAULT_TILES =
      MapUtil.map(
          new Maplet(SeqUtil.seq(0L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(0L, 1L), new PlainTile()),
          new Maplet(SeqUtil.seq(0L, 2L), new TrapTile(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(0L, 3L), new DenTile(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(0L, 4L), new TrapTile(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(0L, 5L), new PlainTile()),
          new Maplet(SeqUtil.seq(0L, 6L), new PlainTile()),
          new Maplet(SeqUtil.seq(1L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(1L, 1L), new PlainTile()),
          new Maplet(SeqUtil.seq(1L, 2L), new PlainTile()),
          new Maplet(SeqUtil.seq(1L, 3L), new TrapTile(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(1L, 4L), new PlainTile()),
          new Maplet(SeqUtil.seq(1L, 5L), new PlainTile()),
          new Maplet(SeqUtil.seq(1L, 6L), new PlainTile()),
          new Maplet(SeqUtil.seq(2L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(2L, 1L), new PlainTile()),
          new Maplet(SeqUtil.seq(2L, 2L), new PlainTile()),
          new Maplet(SeqUtil.seq(2L, 3L), new PlainTile()),
          new Maplet(SeqUtil.seq(2L, 4L), new PlainTile()),
          new Maplet(SeqUtil.seq(2L, 5L), new PlainTile()),
          new Maplet(SeqUtil.seq(2L, 6L), new PlainTile()),
          new Maplet(SeqUtil.seq(3L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(3L, 1L), new WaterTile()),
          new Maplet(SeqUtil.seq(3L, 2L), new WaterTile()),
          new Maplet(SeqUtil.seq(3L, 3L), new PlainTile()),
          new Maplet(SeqUtil.seq(3L, 4L), new WaterTile()),
          new Maplet(SeqUtil.seq(3L, 5L), new WaterTile()),
          new Maplet(SeqUtil.seq(3L, 6L), new PlainTile()),
          new Maplet(SeqUtil.seq(4L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(4L, 1L), new WaterTile()),
          new Maplet(SeqUtil.seq(4L, 2L), new WaterTile()),
          new Maplet(SeqUtil.seq(4L, 3L), new PlainTile()),
          new Maplet(SeqUtil.seq(4L, 4L), new WaterTile()),
          new Maplet(SeqUtil.seq(4L, 5L), new WaterTile()),
          new Maplet(SeqUtil.seq(4L, 6L), new PlainTile()),
          new Maplet(SeqUtil.seq(5L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(5L, 1L), new WaterTile()),
          new Maplet(SeqUtil.seq(5L, 2L), new WaterTile()),
          new Maplet(SeqUtil.seq(5L, 3L), new PlainTile()),
          new Maplet(SeqUtil.seq(5L, 4L), new WaterTile()),
          new Maplet(SeqUtil.seq(5L, 5L), new WaterTile()),
          new Maplet(SeqUtil.seq(5L, 6L), new PlainTile()),
          new Maplet(SeqUtil.seq(6L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(6L, 1L), new PlainTile()),
          new Maplet(SeqUtil.seq(6L, 2L), new PlainTile()),
          new Maplet(SeqUtil.seq(6L, 3L), new PlainTile()),
          new Maplet(SeqUtil.seq(6L, 4L), new PlainTile()),
          new Maplet(SeqUtil.seq(6L, 5L), new PlainTile()),
          new Maplet(SeqUtil.seq(6L, 6L), new PlainTile()),
          new Maplet(SeqUtil.seq(7L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(7L, 1L), new PlainTile()),
          new Maplet(SeqUtil.seq(7L, 2L), new PlainTile()),
          new Maplet(SeqUtil.seq(7L, 3L), new TrapTile(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(7L, 4L), new PlainTile()),
          new Maplet(SeqUtil.seq(7L, 5L), new PlainTile()),
          new Maplet(SeqUtil.seq(7L, 6L), new PlainTile()),
          new Maplet(SeqUtil.seq(8L, 0L), new PlainTile()),
          new Maplet(SeqUtil.seq(8L, 1L), new PlainTile()),
          new Maplet(SeqUtil.seq(8L, 2L), new TrapTile(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(8L, 3L), new DenTile(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(8L, 4L), new TrapTile(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(8L, 5L), new PlainTile()),
          new Maplet(SeqUtil.seq(8L, 6L), new PlainTile()));
  public static final VDMMap DEFAULT_PIECES =
      MapUtil.map(
          new Maplet(SeqUtil.seq(0L, 0L), new TigerPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(0L, 6L), new LionPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(1L, 1L), new CatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(1L, 5L), new DogPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(
              SeqUtil.seq(2L, 0L), new ElephantPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(2L, 2L), new WolfPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(
              SeqUtil.seq(2L, 4L), new LeopardPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(2L, 6L), new RatPiece(Jungle.quotes.PLAYER1Quote.getInstance())),
          new Maplet(SeqUtil.seq(8L, 6L), new TigerPiece(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(8L, 0L), new LionPiece(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(7L, 5L), new CatPiece(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(7L, 1L), new DogPiece(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(
              SeqUtil.seq(6L, 6L), new ElephantPiece(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(6L, 4L), new WolfPiece(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(
              SeqUtil.seq(6L, 2L), new LeopardPiece(Jungle.quotes.PLAYER2Quote.getInstance())),
          new Maplet(SeqUtil.seq(6L, 0L), new RatPiece(Jungle.quotes.PLAYER2Quote.getInstance())));
  public VDMMap tiles;
  public VDMMap pieces;
  private VDMSet allowedMoves = SetUtil.set(new StepMove(), new JumpMove(), new SwimMove());
  public Object currentPlayer;
  public Object winner;
  public Object state;

  public void cg_init_Board_2(final VDMMap bt, final VDMMap p) {

    tiles = Utils.copy(bt);
    pieces = Utils.copy(p);
    winner = null;
    currentPlayer = null;
    state = Jungle.quotes.SETUPQuote.getInstance();
    return;
  }

  public void cg_init_Board_3(final VDMMap piecesArg) {

    cg_init_Board_2(Utils.copy(Board.DEFAULT_TILES), Utils.copy(piecesArg));
  }

  public void cg_init_Board_1() {

    cg_init_Board_2(Utils.copy(Board.DEFAULT_TILES), Utils.copy(Board.DEFAULT_PIECES));
  }

  public Board() {

    cg_init_Board_1();
  }

  public Board(final VDMMap piecesArg) {

    cg_init_Board_3(Utils.copy(piecesArg));
  }

  public Board(final VDMMap bt, final VDMMap p) {

    cg_init_Board_2(Utils.copy(bt), Utils.copy(p));
  }

  public void startGame() {

    Object atomicTmp_1 = Jungle.quotes.PLAYQuote.getInstance();
    Object atomicTmp_2 = Jungle.quotes.PLAYER1Quote.getInstance();
    {
        /* Start of atomic statement */
      state = atomicTmp_1;
      currentPlayer = atomicTmp_2;
    } /* End of atomic statement */

    {
      final Object w = checkWinCon();
      if (!(Utils.equals(w, null))) {
        Object atomicTmp_3 = Jungle.quotes.ENDQuote.getInstance();
        Object atomicTmp_4 = w;
        {
            /* Start of atomic statement */
          state = atomicTmp_3;
          winner = atomicTmp_4;
        } /* End of atomic statement */
      }
    }
  }

  public Boolean validBoard() {

    for (Iterator iterator_3 = MapUtil.dom(this.pieces).iterator(); iterator_3.hasNext(); ) {
      VDMSeq p = (VDMSeq) iterator_3.next();
      if (!(SetUtil.inSet(
          ((Tile) Utils.get(this.tiles, p)).type,
          ((Piece) Utils.get(this.pieces, p)).steppableTiles))) {
        return false;
      }

      Boolean andResult_4 = false;

      if (Utils.equals(((Tile) Utils.get(this.tiles, p)).type, DenTile.TYPE)) {
        if (Utils.equals(
            ((Tile) Utils.get(this.tiles, p)).owner, ((Piece) Utils.get(this.pieces, p)).owner)) {
          andResult_4 = true;
        }
      }

      if (andResult_4) {
        return false;
      }
    }
    return true;
  }

  public Boolean validMove(final VDMSeq source, final VDMSeq dest) {

    if (!(Utils.equals(state, Jungle.quotes.PLAYQuote.getInstance()))) {
      return false;
    }

    if (!(SetUtil.subset(
        SetUtil.set(Utils.copy(source), Utils.copy(dest)), MapUtil.dom(this.tiles)))) {
      return false;
    }

    if (!(SetUtil.inSet(source, MapUtil.dom(this.pieces)))) {
      return false;
    }

    if (Utils.equals(source, dest)) {
      return false;
    }

    if (!(Utils.equals(((Piece) Utils.get(this.pieces, source)).owner, this.currentPlayer))) {
      return false;
    }

    Boolean andResult_5 = false;

    if (SetUtil.inSet(dest, MapUtil.dom(this.pieces))) {
      if (Utils.equals(
          ((Piece) Utils.get(this.pieces, dest)).owner, Jungle.quotes.PLAYER1Quote.getInstance())) {
        andResult_5 = true;
      }
    }

    if (andResult_5) {
      return false;
    }

    Boolean existsExpResult_1 = false;
    VDMSet set_1 = this.allowedMoves;
    for (Iterator iterator_1 = set_1.iterator(); iterator_1.hasNext() && !(existsExpResult_1); ) {
      Move move = ((Move) iterator_1.next());
      existsExpResult_1 = move.validMove(this, Utils.copy(source), Utils.copy(dest));
    }
    return existsExpResult_1;
  }

  private void removePiece(final VDMSeq coord) {

    pieces = MapUtil.domResBy(SetUtil.set(Utils.copy(coord)), Utils.copy(pieces));
  }

  private void addPiece(final VDMSeq coord, final Piece piece) {

    pieces =
        MapUtil.override(Utils.copy(pieces), MapUtil.map(new Maplet(Utils.copy(coord), piece)));
  }

  public void play(final VDMSeq src, final VDMSeq dest) {

    movePiece(Utils.copy(src), Utils.copy(dest));
    changePlayer();
    {
      final Object w = checkWinCon();
      if (!(Utils.equals(w, null))) {
        Object atomicTmp_5 = Jungle.quotes.ENDQuote.getInstance();
        Object atomicTmp_6 = w;
        {
            /* Start of atomic statement */
          state = atomicTmp_5;
          winner = atomicTmp_6;
        } /* End of atomic statement */
      }
    }
  }

  private void movePiece(final VDMSeq src, final VDMSeq dest) {

    Piece pieceToMove = ((Piece) Utils.get(this.pieces, src));
    if (SetUtil.inSet(dest, MapUtil.dom(this.pieces))) {
      Piece defender = ((Piece) Utils.get(this.pieces, dest));
      Piece winnerPiece = capture(Utils.copy(dest), pieceToMove, defender);
      removePiece(Utils.copy(src));
      removePiece(Utils.copy(dest));
      addPiece(Utils.copy(dest), winnerPiece);

    } else {
      removePiece(Utils.copy(src));
      addPiece(Utils.copy(dest), pieceToMove);
    }
  }

  public Object checkWinCon() {

    VDMSet playersWithPieces = SetUtil.set();
    for (Iterator iterator_4 = MapUtil.dom(this.pieces).iterator(); iterator_4.hasNext(); ) {
      VDMSeq coords = (VDMSeq) iterator_4.next();
      if (Utils.equals(((Tile) Utils.get(this.tiles, coords)).type, DenTile.TYPE)) {
        return ((Piece) Utils.get(this.pieces, coords)).owner;
      }
    }
    for (Iterator iterator_5 = MapUtil.dom(this.pieces).iterator(); iterator_5.hasNext(); ) {
      VDMSeq coords = (VDMSeq) iterator_5.next();
      if (!(SetUtil.inSet(((Piece) Utils.get(this.pieces, coords)).owner, playersWithPieces))) {
        playersWithPieces =
            SetUtil.union(
                Utils.copy(playersWithPieces),
                SetUtil.set(((Piece) Utils.get(this.pieces, coords)).owner));
      }
    }
    Boolean andResult_11 = false;

    if (SetUtil.inSet(Jungle.quotes.PLAYER1Quote.getInstance(), playersWithPieces)) {
      if (!(SetUtil.inSet(Jungle.quotes.PLAYER2Quote.getInstance(), playersWithPieces))) {
        andResult_11 = true;
      }
    }

    if (andResult_11) {
      return Jungle.quotes.PLAYER1Quote.getInstance();

    } else {
      Boolean andResult_12 = false;

      if (SetUtil.inSet(Jungle.quotes.PLAYER2Quote.getInstance(), playersWithPieces)) {
        if (!(SetUtil.inSet(Jungle.quotes.PLAYER1Quote.getInstance(), playersWithPieces))) {
          andResult_12 = true;
        }
      }

      if (andResult_12) {
        return Jungle.quotes.PLAYER2Quote.getInstance();

      } else {
        return null;
      }
    }
  }

  public Piece capture(final VDMSeq coord, final Piece attacker, final Piece defender) {

    Tile tile = ((Tile) Utils.get(this.tiles, coord));
    if (Utils.equals(tile.type, TrapTile.TYPE)) {
      if (Utils.equals(attacker.owner, tile.owner)) {
        return attacker;

      } else {
        return defender;
      }
    }

    Boolean andResult_15 = false;

    if (Utils.equals(attacker.type, RatPiece.TYPE)) {
      if (Utils.equals(defender.type, ElephantPiece.TYPE)) {
        andResult_15 = true;
      }
    }

    if (andResult_15) {
      return attacker;
    }

    if (attacker.rank.longValue() >= defender.rank.longValue()) {
      return attacker;

    } else {
      return defender;
    }
  }

  private void changePlayer() {

    if (Utils.equals(this.currentPlayer, Jungle.quotes.PLAYER1Quote.getInstance())) {
      currentPlayer = Jungle.quotes.PLAYER2Quote.getInstance();
    } else {
      currentPlayer = Jungle.quotes.PLAYER1Quote.getInstance();
    }
  }

  public long getMaxX(){
      long maxX = 0;
      while(tiles.containsKey(SeqUtil.seq(maxX, 0L)))
          ++maxX;
      return maxX;
  }

    public long getMaxY(){
        long maxY = 0;
        while(tiles.containsKey(SeqUtil.seq(0l, maxY)))
            ++maxY;
        return maxY;
    }

  public String getNumbers(long size){
      StringBuilder sb = new StringBuilder();
      sb.append("   ");
      for(int tile = 1; tile <= size; ++tile){
          sb.append(" ");
          sb.append(tile);
          sb.append("  ");
      }
      sb.append('\n');
      return sb.toString();
  }

  public String getBorder(long size){
      StringBuilder sb = new StringBuilder();
      sb.append("  +---+");
      for(int tile = 1; tile < size; ++tile){
          sb.append("---+");
      }
      sb.append('\n');
      return sb.toString();
  }

  public String toString() {
      StringBuilder sb = new StringBuilder();
      long maxX = getMaxX();
      long maxY = getMaxY();

      sb.append(getNumbers(maxY));
      sb.append(getBorder(maxY));
      for(long x = maxX-1; x >= 0; --x){
          sb.append(x+1);
          sb.append(' ');
          for(long y = maxY-1; y >= 0; --y){
              sb.append("|");
              if (pieces.containsKey(SeqUtil.seq(x, y)))
                  sb.append(pieces.get(SeqUtil.seq(x, y)));
              else sb.append(' ');
              sb.append(tiles.get(SeqUtil.seq(x, y)));
              if (pieces.containsKey(SeqUtil.seq(x, y)))
                  sb.append(((Piece) pieces.get(SeqUtil.seq(x, y))).owner);
              else sb.append(' ');
          }
          sb.append("| "+(x+1)+"\n");
          sb.append(getBorder(maxY));
      }
      sb.append(getNumbers(maxY));
      return sb.toString();
  }
}
