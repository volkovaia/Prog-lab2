package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;
public class Vigoroth extends Slakoth{
    public Vigoroth(String name, int lvl){
        super(name, lvl);
        setStats(80, 80, 80, 55, 55, 90);
        setType(Type.NORMAL);
        setMove(new Thunderbolt(), new Thunder(), new FurySwipes());
    }

}