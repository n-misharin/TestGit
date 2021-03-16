package Game;

public class Guardian extends Unit{
    public Guardian(Field field) {
        super(TYPE_GUARDIAN, field, SPEED_GUARDIAN);
    }

    @Override
    public boolean isCanMove(Field field) {
        return super.isCanMove(field) &&
                field.getType() == Field.TYPE_TUNNEL &&
                field.getType() == Field.TYPE_BASE;
    }
}
