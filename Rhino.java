///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    Animal
// File:               Rhino
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
 * Class for Rhino that is an animal and herbivore
 *
 * Bugs: N/A
 *
 * @author Kwae Htoo
 */
public class Rhino extends Animal implements Herbivore {

    private final static int FIFTEEN = 15;

    /**
     * No-args constructor for rhino
     */ 
    public Rhino() {
        super(0, 0 ,0);
    }

    /**
    * Constructor for rhino that takes in age, health, and strength
    *
    * @param age age of rhino
    * @param health health of rhino
    * @param strength strength of rhino
    */
    public Rhino(int age, int health, int strength) {
        super(age, health, strength);
    }

    /**
    * Rhino goes to sleep and gains strength
    *
    */
    @Override
    public void sleep() {
        setStrength( getStrength() + FIFTEEN );
    }
    
    /**
    * Rhino eats plant and gains strength
    *
    */
    @Override
    public void eatPlant() {
        Random random = new Random();
        int randNum = random.nextInt(26);

        setStrength( getStrength() + randNum);
    }

 }