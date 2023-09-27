///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Animal
// File:               Elephant
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