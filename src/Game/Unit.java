package Game;

public class Unit {
    public static final int TYPE_WORKER = 0;
    public static final int TYPE_TRANSPORT = 1;
    public static final int TYPE_KAMIKAZE = 2;
    public static final int TYPE_GUARDIAN = 3;

    public static final int SPEED_WORKER = 3;
    public static final int SPEED_TRANSPORT = 3;
    public static final int SPEED_KAMIKAZE = 3;
    public static final int SPEED_GUARDIAN = 3;

    protected int type, speed;
    protected Field position;

    public Unit(int type, Field field, int speed) {
        this.type = type;
        this.position = field;
        this.speed = speed;
    }

    public boolean isCanMove(Field field){
        return Math.abs(position.getPositionX() - field.getPositionX()) +
                Math.abs(position.getPositionY() - field.getPositionY()) == 1 &&
                speed > 0 && !field.isBusy();
    }

    public void move(Field field) throws Exception {
        if (isCanMove(field)){
            field.addUnit(this);
            position.removeUnit(this);
            speed -= 1;
        }
    }
}
