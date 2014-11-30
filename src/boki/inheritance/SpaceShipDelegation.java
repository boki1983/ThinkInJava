package boki.inheritance;

//  delegation
//  介於複合與繼承之間的概念
//  透過複合方式，實現繼承
//  作法更有彈性，delegation方式取得更多控制權，可以選擇只提供物件部分函式
public class SpaceShipDelegation {
    private String name;
    private static SpaceShipControl sc = new SpaceShipControl();
    
    SpaceShipDelegation(String name) {
    	this.name=name;
    }
    void up(int v) { sc.up(v); }
    void down(int v) { sc.down(v); }
    void left(int v) { sc.left(v); }
    void right(int v) { sc.right(v); }
    void forward(int v) { sc.forward(v); }
    void back(int v) { sc.back(v); }
    void turboBoost() { sc.turboBoost(); }
    
    public static void main(String[] args) {
    	SpaceShipDelegation delegation = new SpaceShipDelegation("NASA");
    	delegation.forward(100);
    	delegation.turboBoost();
    	delegation.up(300);
    }
}
