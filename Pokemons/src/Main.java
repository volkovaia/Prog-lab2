import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Darkrai p1 = new Darkrai("Чужой", 1);
        Pokemon p2 = new Watchog("Хищник", 1);
        Pokemon p3 = new Patrat("Чужой среди своих", 3);
        Pokemon p4 = new Vigoroth("Свой среди чужих", 4);
        Pokemon p5 = new Slaking("Гном", 5);
        Pokemon p6 = new Slakoth("Эльф", 6);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addFoe(p2);
        b.addFoe(p5);
        b.addFoe(p6);


        b.go();
    }
}