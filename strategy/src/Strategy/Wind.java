package Strategy;

public class Wind extends Type implements Strategy{

    public Wind (){
        super.setDamage(10);
        super.setSpeed(30);
    }

    @Override
    public void attack() {
        System.out.println("This is a Wind attack" +
                "\nDamage: " + super.getDamage() +
                "\nSpeed: "+ super.getSpeed());
    }
}
