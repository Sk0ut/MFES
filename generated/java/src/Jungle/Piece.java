package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Piece {
  public String type;
  public Object owner;
  public Number rank;
  public VDMSet steppableTiles;

  public void cg_init_Piece_1(final String tt, final Object ow, final Number val) {

    type = tt;
    owner = ow;
    rank = val;
    steppableTiles = SetUtil.set("PlainTile", "TrapTile", "DenTile");
    return;
  }

  public void cg_init_Piece_2(
      final String tt, final Object ow, final Number val, final VDMSet stepTiles) {

    type = tt;
    owner = ow;
    rank = val;
    steppableTiles = Utils.copy(stepTiles);
    return;
  }

  public Piece(final String tt, final Object ow, final Number val, final VDMSet stepTiles) {

    cg_init_Piece_2(tt, ow, val, Utils.copy(stepTiles));
  }

  public Piece(final String tt, final Object ow, final Number val) {

    cg_init_Piece_1(tt, ow, val);
  }

  public Piece() {}

  public String toString() {

    return "Piece{"
        + "type := "
        + Utils.toString(type)
        + ", owner := "
        + Utils.toString(owner)
        + ", rank := "
        + Utils.toString(rank)
        + ", steppableTiles := "
        + Utils.toString(steppableTiles)
        + "}";
  }
}
