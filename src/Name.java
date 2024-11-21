import java.util.Random;

public enum Name {
    COLA, PEPSI, LEGENDA;
    private static Random rnd = new Random();

    static Name random(){
        Name[] names = Name.values();
        int selected = rnd.nextInt(names.length);
        return names[selected];
    }

}
