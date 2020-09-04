package circus.animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a Duck";
    }

    @Override
    public int getValue() {
        return 10;
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
}
