import java.util.ArrayList;
import java.util.List;

public class Tank extends Unit {
    public Tank(String name, int attack, int defense, List<String> abilities) {
        super(name, attack, defense, abilities);
    }

    @Override
    public Unit clone() {
        return new Tank(this.name, this.attack, this.defense, new ArrayList<>(this.abilities));
    }
}
