import java.util.ArrayList;
import java.util.List;

public class Infantry extends Unit{
    public Infantry(String name, int attack, int defense, List<String> abilities) {
        super(name, attack, defense, abilities);
    }

    @Override
    public Unit clone() {
        return new Infantry(this.name, this.attack, this.defense, new ArrayList<>(this.abilities));
    }
}
