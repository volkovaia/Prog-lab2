package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;
public class Darkrai extends Pokemon{
    public Darkrai(String name, int lvl){
        super(name, lvl);
        setStats(70, 90, 90, 135, 90, 125);
        setType(Type.DARK);
        setMove(new Thunderbolt(), new Haze(), new QuickAttack(), new PoisonJab());
    }

}