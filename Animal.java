
import java.util.Random;

/**
 * Class for creating animal
 *
 * Bugs: Something might be wrong w/ attack method (but I'm not sure)
 *
 * @author Kwae Htoo
 */
public class Animal {

    // variables 
    private int age;
    private int health;
    private int strength;

    // constructors
    /**
    * No-args constrcutor
    */
    public Animal() {
        this.age = 0;
        this.health = 0;
        this.strength = 0;
    }

    /**
    * Constructor for animal that takes in age, health, and strength
    *
    * @param age age of animal
    * @param health health of animal
    * @param strength strength of animal
    */
    public Animal (int age, int health, int strength) {
        this.age = age;
        this.health = health;
        this.strength = strength;
    }

    // getter & setter methods

    /**
    * Gets the age of animal
    * @return age
    */
    public int getAge() {
        return this.age;
    }

    /**
    * Gets the health of animal
    *
    * @return health
    */
    public int getHealth() {
        return this.health;
    }

    /**
    * Gets the strength of the animal
    *
    * @return strength
    */
    public int getStrength() {
        return this.strength;
    }

    /**
    * Sets the health of the animal
    *
    * @param health a int number representing health
    */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
    * Sets the strength of the animal
    *
    * @param strength an int number representing strength
    */
    public void setStrength(int strength) {
        this.strength = strength;
    }  

    // methods
    /**
    * Checks to see if the current object and int animal are the same species
    *
    * @param animal an Animal
    * @return whether they are same species
    */
    public boolean sameSpecies(Animal animal) {
        if (getClass().getName() == animal.getClass().getName()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
    * generates a random number & preforms an attack on the input animal
    *
    * @param animal an animal
    * @return the attack value
    */
    public int attack(Animal animal) {

        int randNum = (int)(1 + (Math.random() * this.strength));
        //Random random = new Random();
        //int randNum = random.nextInt((this.strength-1) + 1) + 1;
        animal.setHealth(animal.getHealth() - randNum);

        return randNum;
    }

    /**
    * creates a string of the attributes of the animal
    *
    * @return string of attributes
    */
    @Override
    public String toString() {
        return "(" + getClass().getName() + ")" + " age: " + getAge() +
            "; health: " + getHealth() + "; strength: " + getStrength();
    }

    // overriden by subclasses
    /**
    * An animal will go to sleep
    */
    public void sleep() {
    }

}
