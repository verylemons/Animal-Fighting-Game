///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Animal
// File:               Lion
// Quarter:            CSE 8B Spring 2023
//
// Author:             Kwae Htoo
// Instructor's Name:  Professor Ochoa
//
///////////////////////////////////////////////////////////////////////////////
//                   STUDENTS WHO GET HELP COMPLETE THIS SECTION
//                   You must fully acknowledge and credit all sources of help,
//                   other than Instructors and TAs.
//
// Persons:          N/A
//
// Online sources:   N/A
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * Class for creating lion that is an animal and carnivore
 *
 * Bugs: N/A
 *
 * @author Kwae Htoo
 */
public class Lion extends Animal implements Carnivore {

    private final static int TWENTY = 20;

    /**
     * No-args constructor for lion
     */
    public Lion() {
        super(0, 0, 0);
    }

    /**
    * Constructor for lion that takes in age, health, and strength
    *
    * @param age age of lion
    * @param health health of lion
    * @param strength strength of lion
    */
    public Lion(int age, int health, int strength) {
        super(age, health, strength);
    }

    /**
    * Lion goes to sleep and gains strength
    *
    */
    @Override
    public void sleep() {
        setStrength( getStrength() + TWENTY );
    }

    /**
    * Lion eats and animal an gains strength
    *
    * @param animal an animal
    */
    @Override
    public void eatAnimal(Animal animal) {
        int inputStrength = animal.getStrength()/2;
        setStrength(getStrength() + inputStrength);
    }
}