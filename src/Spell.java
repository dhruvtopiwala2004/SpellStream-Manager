public class Spell {
    private String name;
    private int powerLevel;
    private String school;

    public Spell(String name, int powerLevel, String school) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Spell: " + name +
                ", Power Level: " + powerLevel +
                ", School: " + school;
    }
}
