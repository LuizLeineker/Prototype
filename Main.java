import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //REGISTRO
        UnitRegistry registry = new UnitRegistry();

        // CRIANDO O EXERCITO - BASE
        registry.registerUnit("soldado", new Infantry("Soldado Suporte", 50, 30, Arrays.asList("Precisao na Mira", "Velocidade")));

        registry.registerUnit("tank", new Tank("Rhyno", 100, 200, Arrays.asList("100% Blindado", "Explosivos")));

        registry.registerUnit("hydra", new Plane("Hydra", 120, 80, Arrays.asList("Silencioso", "Preciso")));

        // COPIANDO TROPAS
        Unit soldado1 = registry.getUnit("soldado");
        Unit soldado2 = registry.getUnit("soldado");
        Unit soldado3 = registry.getUnit("soldado");
        Unit soldado4 = registry.getUnit("soldado");
        Unit soldado5 = registry.getUnit("soldado");

        Unit tank1 = registry.getUnit("tank");
        Unit tank2 = registry.getUnit("tank");

        Unit aviao = registry.getUnit("hydra");

        // ADD UPGRADE
        soldado3.addAbility("Granada");
        soldado3.addAbility("Molotov");
        soldado4.addAbility("Flash");
        soldado5.addAbility("Molotov");

        tank1.addAbility("Metralhadora");
        aviao.addAbility("Extremamente Rápido");

        // PADRÃO
        System.out.println("Soldado Base: ");
        System.out.println(registry.getUnit("soldado"));

        // COPIAR
        System.out.println("\nSoldados Copias:");
        System.out.println(soldado1);
        System.out.println("\n");
        System.out.println(soldado2);
        System.out.println("\n");
        System.out.println(soldado3);
        System.out.println("\n");
        System.out.println(soldado4);
        System.out.println("\n");
        System.out.println(soldado5);

        // OUTRAS UNIDADES
        System.out.println("\nTANK Inicial: ");
        System.out.println(registry.getUnit("tank"));

        System.out.println("\nTANK Copias:");
        System.out.println(tank1);
        System.out.println("\n");
        System.out.println(tank2);


        System.out.println("\nHydra Inicial: ");
        System.out.println(registry.getUnit("hydra"));
        System.out.println("\nHydra Copia:");
        System.out.println(aviao);


    }
}