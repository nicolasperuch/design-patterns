package strategy;

public class Fire extends Type implements Strategy{

    public Fire() {
        super.setDamage(20);
        super.setSpeed(15);
    }

    @Override
    public void attack() {
        System.out.println("This is a Fire attack" +
                "\nDamage: " + super.getDamage() +
                "\nSpeed: "+ super.getSpeed());
    }
}
