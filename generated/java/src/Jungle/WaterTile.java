package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class WaterTile extends Tile {
  public static final String TYPE = "WaterTile";

  public void cg_init_WaterTile_1() {

    cg_init_Tile_1(WaterTile.TYPE, null);
  }

  public WaterTile() {

    cg_init_WaterTile_1();
  }

  public String toString() {

    return "~";
  }
}
