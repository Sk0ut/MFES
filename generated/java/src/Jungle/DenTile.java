package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class DenTile extends Tile {
  public static final String TYPE = "DenTile";

  public void cg_init_DenTile_1(final Object ow) {

    cg_init_Tile_1(DenTile.TYPE, ((Object) ow));
  }

  public DenTile(final Object ow) {

    cg_init_DenTile_1(ow);
  }

  public DenTile() {}

  public String toString() {

    return "DenTile{" + "TYPE = " + Utils.toString(TYPE) + "}";
  }
}
