package boki.inheritance;

import boki.util.print.Print;

public class SpaceShipControl {
    void up(int v) { Print.print("up " + v + " miles"); }
    void down(int v) { Print.print("down " + v + " miles"); }
    void left(int v) { Print.print("left " + v + " miles"); }
    void right(int v) { Print.print("right " + v + " miles"); }
    void forward(int v) { Print.print("forward " + v + " miles"); }
    void back(int v) { Print.print("back " + v + " miles"); }
    void turboBoost() { Print.print("turboBoost"); }
}
