package Skills;
import ru.ifmo.se.pokemon.*;
public class SandAttack extends StatusMove{
    public SandAttack(){
        super(Type.GROUND, 0,1);
    }
    protected String describe(){
        return "SandAttack";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ACCURACY, -1);
    }
}
