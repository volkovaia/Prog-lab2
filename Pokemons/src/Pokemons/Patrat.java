package Pokemons;

import ru.ifmo.se.pokemon.*;
import Skills.*;
public class Patrat extends Pokemon{
    public Patrat(String name, int lvl){
        super(name, lvl);
        setStats(45, 55, 39, 35, 39, 42);
        setType(Type.NORMAL);
        setMove(new SuperFang(), new SandAttack(), new Confide());
    }

}

