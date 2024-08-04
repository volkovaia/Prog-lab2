package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;
public class Slakoth extends Pokemon{
    public Slakoth(String name, int lvl){
        super(name, lvl);
        setStats(60, 60, 60, 35, 35, 30);
        setType(Type.NORMAL);
        setMove(new Thunderbolt(), new Thunder());
    }

}
