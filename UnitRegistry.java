import java.util.HashMap;
import java.util.Map;

public class UnitRegistry {
    private Map<String, Unit> prototypes = new HashMap<>();

    public void registerUnit(String key, Unit unit) {
        prototypes.put(key, unit);
    }

    public Unit getUnit(String key) {
        Unit prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        System.out.println("Protótipo não encontrado: " + key);
        return null;
    }
}
