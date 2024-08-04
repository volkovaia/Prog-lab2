package Skills;
import ru.ifmo.se.pokemon.*;
public class Thunder extends SpecialMove{
    public Thunder(){
        super(Type.ELECTRIC, 110, 0.7);
    }
    protected String describe(){
        return "Thunder";
    }
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3)
            Effect.paralyze(p);


    }
}
