package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;
public class Slaking extends Vigoroth{
    public Slaking(String name, int lvl){
        super(name, lvl);
        setStats(50, 70, 100, 40, 40, 30);
        setType(Type.STEEL, Type.ROCK);
        setMove(new Thunderbolt(), new Thunder(), new FurySwipes(), new WorkUp());
    }

}