
/**
 * Class for preforming activites for animals
 *
 * Bugs: Fight method(?)
 *
 * @author Kwae Htoo
 */
public class AnimalActivities {

    /**
    * empty method for animal activites
    */
    private AnimalActivities() {
    }

    /**
    * Two animals fight each other
    *
    * @param animal1 an animal
    * @param animal2 an animal
    * @return 0, 1, 2 (which animal wins or if they tie)
    */
    public static int fight(Animal animal1, Animal animal2) {
        int round = 0;
        boolean isAnimalOnePoisoned = false;
        boolean isAnimalTwoPoisoned = false;
        boolean poisened = false;
        int result = 0;

        // poisoning animals
        if (animal1 instanceof Frog) {
            if (((Frog)animal1).poisonAnimal() == true) {
                isAnimalTwoPoisoned = true;
                poisened = true;
            }
        }
        else if (animal1 instanceof Snake) {
            if (((Snake)animal1).poisonAnimal() == true) {
                isAnimalTwoPoisoned = true;
                poisened = true;
            }
        }

        if (animal2 instanceof Frog) {
            if(((Frog)animal2).poisonAnimal() == true) {
                isAnimalOnePoisoned = true;
                poisened = true;
            }
        }
        else if (animal2 instanceof Snake) {
            if (((Snake)animal2).poisonAnimal() == true) {
                isAnimalOnePoisoned = true;
                poisened = true;
            }
        }

        // fighting
        while (animal1.getHealth() > 0 && animal2.getHealth() > 0) {
            printRound(round);
            printBothAnimals(animal1, animal2);
            // attacking
            int attackNum1 = animal1.attack(animal2);
            printAttack("LEFT", attackNum1);
            int attackNum2 = animal2.attack(animal1);
            printAttack("RIGHT", attackNum2);
            round += 1;
        }

        // results
        printFinalStats(animal1, animal2, poisened);

        if (animal1.getHealth() <= 0 && animal2.getHealth() <= 0) {
            printTieGame();
            result = 0;
        }
        else {
            // if animal 1 won
            if (animal2.getHealth() <= 0) {
                if (isAnimalOnePoisoned == true) {
                    printTieGame();
                    result = 0;
                }
                else {
                    if (animal1 instanceof Lion) {
                    ((Lion)animal1).eatAnimal(animal2);
                    }
                    else if (animal1 instanceof Tiger) {
                        ((Tiger)animal1).eatAnimal(animal2);
                    }
                    else if (animal1 instanceof Snake) {
                        ((Snake)animal1).eatAnimal(animal2);
                    }
                    else if (animal1 instanceof Frog) {
                        ((Frog)animal1).eatAnimal(animal2);
                    }
                    else if (animal1 instanceof Elephant) {
                        ((Elephant)animal1).eatPlant();
                    }
                    else if (animal1 instanceof Rhino) {
                        ((Rhino)animal1).eatPlant();
                    }
                    printWinner(LEFT);
                    result = 1;;
                }
            }
            else if (animal1.getHealth() <= 0) {
                // if animal 2 won
                if (isAnimalTwoPoisoned == true) {
                    printTieGame();
                    return 0;
                }
                else {
                    if (animal2 instanceof Lion) {
                        ((Lion)animal2).eatAnimal(animal1);
                    }
                    else if (animal2 instanceof Tiger) {
                        ((Tiger)animal2).eatAnimal(animal1);
                    }
                    else if (animal2 instanceof Snake) {
                        ((Snake)animal2).eatAnimal(animal1);
                    }
                    else if (animal2 instanceof Frog) {
                        ((Frog)animal2).eatAnimal(animal1);
                    }
                    else if (animal2 instanceof Elephant) {
                        ((Elephant)animal2).eatPlant();
                    }
                    else if (animal2 instanceof Rhino) {
                        ((Rhino)animal2).eatPlant();
                    }
                    printWinner(RIGHT);
                    result = 2;
                }
            }
        }
        return result;
    }

    /**
    * Reproduction between two animals of the same species
    *
    * @param animal1 an animal
    * @param animal2 an animal
    * @return a baby animal
    */
    public static Animal reproduce(Animal animal1, Animal animal2) {
        if (animal1.getAge() > 5 && animal2.getAge() > 5) {
            if (animal1.sameSpecies(animal2)) {
                if (animal1 instanceof Lion && animal2 instanceof Lion) {
                    int babyStrength = ((animal1.getStrength()+
                                    animal2.getStrength())/2)/2;
                    Lion lion = new Lion(0, 100, babyStrength);
                    return lion;
                }
                else if (animal1 instanceof Tiger && animal2 instanceof Tiger){
                    int babyStrength = ((animal1.getStrength()+
                                    animal2.getStrength())/2)/2;
                    Tiger tiger = new Tiger(0, 100, babyStrength);
                    return tiger;
                }
                else if (animal1 instanceof Elephant &&
                        animal2 instanceof Elephant){
                    int babyStrength = ((animal1.getStrength()+
                                    animal2.getStrength())/2)/2;
                    Elephant elephant = new Elephant(0, 100, babyStrength);
                    return elephant;
                }
                else if (animal1 instanceof Rhino && animal2 instanceof Rhino){
                    int babyStrength = ((animal1.getStrength()+
                                    animal2.getStrength())/2)/2;
                    Rhino rhino = new Rhino(0, 100, babyStrength);
                    return rhino;
                }
                else if (animal1 instanceof Snake && animal2 instanceof Snake){
                    int babyStrength = ((animal1.getStrength()+
                                    animal2.getStrength())/2)/2;
                    Snake snake = new Snake(0, 100, babyStrength);
                    return snake;
                }
                else if (animal1 instanceof Frog && animal2 instanceof Frog){
                    int babyStrength = ((animal1.getStrength()+
                                    animal2.getStrength())/2)/2;
                    Frog frog = new Frog(0, 100, babyStrength);
                    return frog;
                }
            }
            else {
                Animal animal = new Animal();
                return animal;
            }
        }
        Animal animal = new Animal();
        return animal;
    }
    

    /**
    * Use this method in fight() to display the stats of both animals together
    *
    * @param (animal1) Animal on the left side to display stats
    * @param (animal2) Animal on the right side to display stats
    */
    public static void printBothAnimals(Animal animal1, Animal animal2) {
        int ageSpacing = calcSpacing(Integer.toString(animal1.getAge()));
        int healthSpacing = calcSpacing(Integer.toString(animal1.getHealth()));
        int strSpacing = calcSpacing(Integer.toString(animal1.getStrength()));
        int animalSpacing = calcSpacing(animal1.getClass().getName());
        String str = "(" + animal1.getClass().getName() + ")" +
            " ".repeat(animalSpacing) + "(" +
            animal2.getClass().getName() + ")\n" +
            "----------" + " " + "----------\n" +
            "A: " + animal1.getAge() + " ".repeat(ageSpacing) +
            "A: " + animal2.getAge() + "\n" +
            "H: " + animal1.getHealth() + " ".repeat(healthSpacing) +
            "H: " + animal2.getHealth() + "\n" +
            "S: " + animal1.getStrength() + " ".repeat(strSpacing) +
            "S: " + animal2.getStrength() + "\n";
        System.out.println(str);
    }

    /**
    * Helper method for printBothAnimals()
    *
    * @param (str) String on the left - used to calculate spacing
    * @return An int describing how many spaces to put between strings
    */
    public static int calcSpacing(String str) {
        int totalWidth = SPACING;
        int str1Width = str.length();
        int spacing = (totalWidth - str1Width);
        if (spacing < 0) {
            return 0;
        }
        return spacing;
    }

    /**
    * Use this method in fight() to display the current round.
    * @param (round) An int of the round (should start at 0)
    */
    public static void printRound(int round) {
        System.out.println();
        System.out.println("Round " + round + ":");
    }

    /**
    * Use this method in fight() to display the damage each round.
    *
    * @param (side) The side of the Animal that invoked the attack().
    * @param (damage) The int (damage) returned from an attack() call
    */
    public static void printAttack(String side, int damage) {
        System.out.println(side + " does " + damage + " damage!");
    }

    /**
    * Use this method in fight() to display final stats and poison status.
    *
    * @param (animal1) Left animal
    * @param (animal2) Right animal
    * @param (poisoned) If either animal was poisoned
    */
    public static void printFinalStats(Animal animal1, Animal animal2,
    boolean poisoned) {
        System.out.println();
        printBothAnimals(animal1, animal2);
        if (poisoned) {
            System.out.println("An animal was poisoned.");
        }
    }

    /**
    * Use this method in fight() to display a tie game.
    */
    public static void printTieGame() {
        System.out.println("-------GAME OVER-------");
        System.out.println("TIE: Both animals died!");
    }

    /**
    * Use this method in fight() to display the winner.
    * @param (side) The side of the Animal that won.
    */
    public static void printWinner(String side) {
        System.out.println("-------GAME OVER-------");
        System.out.println(side + " animal wins!");
    }

    // Necessary constants
    private final static int NUM_ANIMALS = 6;
    private final static int SPACING = 17;
    private final static String LEFT = "Left";
    private final static String RIGHT = "Right";

}
