
import java.util.Random;

/**
 * Class for Frog that is an animal and Carnivore and poisonous
 *
 * Bugs: N/A
 *
 * @author Kwae Htoo
 */

public class Frog extends Animal implements Carnivore, Poisonous {

    private final static int TEN = 10;

    /**
     * No-args constructor for frog
     */ 
    public Frog() {
        super(0, 0 , 0);
    }
    
    /**
    * Constructor for frog that takes in age, health, and strength
    *
    * @param age age of frog
    * @param health health of frog
    * @param strength strength of frog
    */
    public Frog(int age, int health, int strength) {
        super( age, health, strength );
    }

    /**
    * Frog goes to sleep and gains strength
    *
    */
    @Override
    public void sleep() {
        setStrength( getStrength() + TEN );
    }

    /**
    * Frog eats a fly an gains strength
    *
    * @param animal an animal
    */
    @Override
    public void eatAnimal(Animal animal) {
        int inputStrength = animal.getStrength()/4;
        setStrength(getStrength() + inputStrength);
    }

    /**
    * Snake has a 20% chance to poison an animal
    *
    */
    @Override
    public boolean poisonAnimal() {

        Random random = new Random();
        double randNum = random.nextDouble();

        if (randNum > 0.2) {
            return true;
        }
        else {
            return false;
        }
    }

}
