package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PlainTile extends Tile {
  public static final String TYPE = "PlainTile";

  public void cg_init_PlainTile_1() {

    cg_init_Tile_1(PlainTile.TYPE, null);
  }

  public PlainTile() {

    cg_init_PlainTile_1();
  }

  public String toString() {

    return " ";
  }
}
