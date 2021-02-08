public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if ( f instanceof Unit){
            System.out.println("f instanceof Unit");
        }
        if ( f instanceof Fightable){
            System.out.println("f instanceof Fightable");
        }
        if ( f instanceof Movable){
            System.out.println("f instanceof Movable");
        }
        if ( f instanceof Attackable){
            System.out.println("f instanceof Attackable");
        }
    }
}

class Fighter extends Unit implements  Fightable {

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}
class Unit {
    int currentHP; // 유닛의 체력
    int x; // 유닛의 위치 (x좌표)
    int y; // 유닛의 위치 (y좌표)
}

interface Fightable extends Movable, Attackable{ }

interface Movable{
    public abstract void move(int x, int y);
}

interface Attackable{
    public abstract void attack(Unit u);
}
