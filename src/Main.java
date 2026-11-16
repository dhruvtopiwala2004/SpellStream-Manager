import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Spell> spells = new ArrayList<>();

        spells.add(new Spell("Fireball", 85, "Evocation"));
        spells.add(new Spell("Shadow Curse", 92, "Necromancy"));
        spells.add(new Spell("Invisibility", 70, "Illusion"));
        spells.add(new Spell("Lightning Bolt", 88, "Evocation"));
        spells.add(new Spell("Raise Dead", 95, "Necromancy"));
        spells.add(new Spell("Mirror Image", 65, "Illusion"));
        spells.add(new Spell("Ice Storm", 80, "Evocation"));
        spells.add(new Spell("Soul Drain", 90, "Necromancy"));
        spells.add(new Spell("Phantom Walk", 75, "Illusion"));
        spells.add(new Spell("Meteor Strike", 99, "Evocation"));

        System.out.println("Intergalactic Spell Archive");
        System.out.println("---------------------------");

        for (Spell spell : spells) {
            System.out.println(spell);
        }
    }
}
