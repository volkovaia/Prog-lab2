package Skills;
import ru.ifmo.se.pokemon.*;
public class FurySwipes extends PhysicalMove{
    public FurySwipes(){
        super(Type.NORMAL, 18, 0.8);
    }
    protected  String describe(){
        return "FurySwipes";
    }
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.25).stat(Stat.SPEED, -1));
    }
}


