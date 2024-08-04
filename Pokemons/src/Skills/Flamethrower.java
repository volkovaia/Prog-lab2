package Skills;
import ru.ifmo.se.pokemon.*;
public class Flamethrower extends SpecialMove{
    public Flamethrower(){
            super(Type.FIRE, 90, 1);
        }
        protected String describe(){
            return "Flamethrower";
        }
        protected void applyOppEffects(Pokemon p) {
            if (Math.random() <= 0.1)
                Effect.burn(p);

        }
    }

