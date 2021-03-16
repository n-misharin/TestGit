package Game;

public class Kamikaze extends Unit{
    public Kamikaze(Field field) {
        super(TYPE_KAMIKAZE, field, SPEED_KAMIKAZE);
    }

    @Override
    public boolean isCanMove(Field field) {
        return super.isCanMove(field) &&
                field.getType() == Field.TYPE_TUNNEL &&
                field.getType() == Field.TYPE_BASE;
    }
}
