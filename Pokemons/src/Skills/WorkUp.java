package Skills;
import ru.ifmo.se.pokemon.*;
public class WorkUp extends StatusMove{
    public WorkUp(){
        super(Type.NORMAL, 0, 0);
    }
    protected String describe(){
        return "WorkUp";
    }
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK, 1));
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, 1));



    }
}
