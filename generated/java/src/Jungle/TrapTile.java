package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TrapTile extends Tile {
  public static final String TYPE = "TrapTile";

  public void cg_init_TrapTile_1(final Object ow) {

    cg_init_Tile_1(TrapTile.TYPE, ((Object) ow));
  }

  public TrapTile(final Object ow) {

    cg_init_TrapTile_1(ow);
  }

  public TrapTile() {}

  public String toString() {

    return "TrapTile{" + "TYPE = " + Utils.toString(TYPE) + "}";
  }
}
