import java.util.ArrayList;
import java.util.List;

public class Plane extends Unit {
    public Plane(String name, int attack, int defense, List<String> abilities) {
        super(name, attack, defense, abilities);
    }

    @Override
    public Unit clone() {
        return new Plane(this.name, this.attack, this.defense, new ArrayList<>(this.abilities));
    }
}