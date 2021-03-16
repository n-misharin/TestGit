package Game;

public class Worker extends Unit{

    public Worker(Field field) {
        super(TYPE_WORKER, field, SPEED_WORKER);
    }

    @Override
    public boolean isCanMove(Field field) {
        return super.isCanMove(field);
    }

    @Override
    public void move(Field field) throws Exception {
        if (isCanMove(field)){
            field.addUnit(this);
            position.removeUnit(this);
            if (field.getType() != Field.TYPE_TUNNEL && field.getType() != Field.TYPE_BASE){
                speed = 0;
            }else{
                speed -= 1;
            }
        }
    }
}
