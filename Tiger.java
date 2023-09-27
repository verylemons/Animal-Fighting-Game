///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Animal
// File:               Tiger
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
 * Class for creating tiger that is an animal and carnivore
 *
 * Bugs: N/A
 *
 * @author Kwae Htoo
 */

public class Tiger extends Animal implements Carnivore {

    private final static int FIFTEEN = 15;

    /**
     * No-args constructor for tiger
     */
    public Tiger() {
        super( 0 , 0, 0 );
    }

    /**
    * Constructor for tiger that takes in age, health, and strength
    *
    * @param age age of tiger
    * @param health health of tiger
    * @param strength strength of tiger
    */
    public Tiger(int age, int health, int strength) {
        super(age, health, strength);
    }

    /**
    * Tiger goes to sleep and gains strength
    *
    */
    @Override
    public void sleep() {
        setStrength( getStrength() + FIFTEEN );
    }

    /**
    * Tiger eats and animal an gains strength
    *
    * @param animal an animal
    */
    @Override
    public void eatAnimal(Animal animal) {
        int inputStrength = animal.getStrength()/3;
        setStrength(getStrength() + inputStrength);
    }
}