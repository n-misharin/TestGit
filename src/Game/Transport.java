package Game;

public class Transport extends Unit{
    public Transport(Field field) {
        super(TYPE_TRANSPORT, field, SPEED_TRANSPORT);
    }

    @Override
    public boolean isCanMove(Field field) {
        return super.isCanMove(field) &&
                field.getType() == Field.TYPE_TUNNEL &&
                field.getType() == Field.TYPE_BASE;
    }
}
