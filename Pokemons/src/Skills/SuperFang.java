package Skills;
import ru.ifmo.se.pokemon.*;
public class SuperFang extends PhysicalMove{
    public SuperFang(){
        super(Type.NORMAL, 0, 0.9);
    }
    protected String describe(){
        return "SuperFang";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP, -1);
    }
}
