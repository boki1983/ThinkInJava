package boki.inheritance;

//  delegation
//  ����ƦX�P�~�Ӥ���������
//  �z�L�ƦX�覡�A��{�~��
//  �@�k�󦳼u�ʡAdelegation�覡���o��h�����v�A�i�H��ܥu���Ѫ��󳡤��禡
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
