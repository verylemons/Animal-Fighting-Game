
import java.util.Random;

/**
 * Class for elephant  that is an animal and herbivore
 *
 * Bugs: N/A
 *
 * @author Kwae Htoo
 */
public class Elephant extends Animal implements Herbivore {

    private final static int TEN = 10;

    /**
     * No-args constructor for elephant
     */ 
    public Elephant() {
        super(0 , 0 ,0);
    }

    /**
    * Constructor for elephant that takes in age, health, and strength
    *
    * @param age age of elephant
    * @param health health of elephant
    * @param strength strength of elephant
    */
    public Elephant(int age, int health, int strength) {
        super(age, health, strength);
    }

    /**
    * Elephant goes to sleep and gains strength
    *
    */
    @Override
    public void sleep() {
        setStrength( getStrength() + TEN );
    }

    /**
    * Elephant eats plant and gains strength
    *
    */
    @Override
    public void eatPlant() {
        Random random = new Random();
        int randNum = random.nextInt(41);

        setStrength( getStrength() + randNum);
    }
}
