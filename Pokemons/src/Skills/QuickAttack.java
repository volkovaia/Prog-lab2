package Skills;
import ru.ifmo.se.pokemon.*;
public class QuickAttack extends PhysicalMove{
    public QuickAttack(){
        super(Type.NORMAL, 40, 1);
    }
    protected String describe(){
        return "QuickAttack";
    }
}


