package Strategy;

public class Water extends Type implements Strategy{

    public Water (){
        super.setDamage(15);
        super.setSpeed(20);
    }

    @Override
    public void attack() {
        System.out.println("This is a Water attack" +
                "\nDamage: " + super.getDamage() +
                "\nSpeed: "+ super.getSpeed());
    }
}
