import java.util.ArrayList;
import java.util.List;

public abstract class Unit implements Prototype {
    protected String name;
    protected int attack;
    protected int defense;
    protected List<String> abilities;

    public Unit(String name, int attack, int defense, List<String> abilities) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        // Criar uma cópia independente da lista
        this.abilities = new ArrayList<>(abilities);
    }

    // Getters e setters para acesso
    public String getName() { return name; }
    public int getAttack() { return attack; }
    public int getDefense() { return defense; }
    public List<String> getAbilities() { return abilities; }

    public void addAbility(String ability) {
        abilities.add(ability);
    }

    // Método abstrato clone() será implementado nas subclasses
    @Override
    public abstract Unit clone();

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", abilities=" + abilities +
                '}';
    }
}