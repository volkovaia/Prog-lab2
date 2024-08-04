package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;
public class Watchog extends Patrat{
    public Watchog(String name, int lvl) {
        super(name, lvl);
        setStats(60, 85, 69, 60, 69, 77);
        setType(Type.NORMAL);
        setMove(new SuperFang(), new SandAttack(), new Confide(), new Flamethrower());
    }
}