package strategy;

public class Earth extends Type implements Strategy {

    public Earth (){
        super.setDamage(30);
        super.setSpeed(10);
    }
    @Override
    public void attack() {
        System.out.println("This is a Earth attack" +
                "\nDamage: " + super.getDamage() +
                "\nSpeed: "+ super.getSpeed());
    }
}
