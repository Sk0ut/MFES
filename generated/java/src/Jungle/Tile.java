package Jungle;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tile {
  public String type;
  public Object owner;

  public void cg_init_Tile_1(final String tt, final Object ow) {

    type = tt;
    owner = ow;
    return;
  }

  public Tile(final String tt, final Object ow) {

    cg_init_Tile_1(tt, ow);
  }

  public Tile() {}

  public String toString() {

    return "Tile{"
        + "type := "
        + Utils.toString(type)
        + ", owner := "
        + Utils.toString(owner)
        + "}";
  }
}
