///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Animal
// File:               Snake
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
 * Class for snake that is an animal and carinvore and poisonous
 *
 * Bugs: N/A
 *
 * @author Kwae Htoo
 */
public class Snake extends Animal implements Carnivore, Poisonous {

    private final static int FIFTEEN = 15;

    /**
     * No-args constructor for snake
     */ 
    public Snake() {
        super( 0, 0, 0);
    }

    /**
    * Constructor for snake that takes in age, health, and strength
    *
    * @param age age of snake
    * @param health health of snake
    * @param strength strength of snake
    */
    public Snake(int age, int health, int strength) {
        super(age, health, strength);
    }

    /**
    * Snake goes to sleep and gains strength
    *
    */
    @Override
    public void sleep() {
        setStrength( getStrength() + FIFTEEN );
    }

    /**
    * Snake eats an animal an gains strength
    *
    * @param animal an animal
    */
    @Override
    public void eatAnimal(Animal animal) {
        setStrength( getStrength() + animal.getStrength() );
    }

    /**
    * Snake has a 40% chance to poison an animal
    *
    */
    @Override
    public boolean poisonAnimal() {

        Random random = new Random();
        double randNum = random.nextDouble();

        if (randNum > 0.4) {
            return true;
        }
        else {
            return false;
        }
    }

}