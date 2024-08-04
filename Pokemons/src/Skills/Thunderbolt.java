package Skills;
import ru.ifmo.se.pokemon.*;
public class Thunderbolt extends SpecialMove{
    public Thunderbolt(){
        super(Type.ELECTRIC, 90, 1);
    }
    protected String describe(){
        return "Thunderbolt";
    }
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1)
            Effect.paralyze(p);


    }
}
