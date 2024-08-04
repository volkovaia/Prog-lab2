package Skills;
import ru.ifmo.se.pokemon.*;
public class Haze extends StatusMove{
    public Haze(){
        super(Type.ICE, 0, 1);
    }
    protected String describe(){
        return "Haze";
    }
    protected void applyOppEffects(Pokemon p) {
        p.restore();
    }
}
