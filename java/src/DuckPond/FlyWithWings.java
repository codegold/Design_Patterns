package src.DuckPond;

public class FlyWithWings extends Duck implements FlyBehavior{
    @Override
    void display() {

    }

    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
