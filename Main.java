
/**
 * This class if for creating and testing unit tests
 *
 * Bugs: N/A
 *
 * @author Kwae Htoo
 */

public class Assignment8 {

    /**
    * creating and testing
    *
    * @return whether a unit test has passed or failed
    */
    public static boolean unitTests() {
        // Test One:
        Animal snake = new Snake(10, 100, 70);
        Animal tiger = new Tiger(10, 100, 70);
        int result = AnimalActivities.fight(snake, tiger);

        //Test Two:
        Animal frog = new Frog(10, 100, 5);
        frog.sleep();
        if (frog.getStrength() != 15) {
            System.out.println("Test Two Failed!");
            return false;
        }
        else {
            System.out.println("Test Two PASSED!");
        }

        //Test Three:
        Rhino rhino = new Rhino(10, 100, 50);
        Lion lion = new Lion(10, 100, 50);
        lion.eatAnimal(rhino);
        if (lion.getStrength() != 75) {
            System.out.println("Test Three Failed!");
            return false;
        }
        else {
            System.out.println("Test THREE PASSED!");
        }

        //Test Four:
        Elephant elephant = new Elephant(10, 50, 1);
        if (AnimalActivities.fight(lion, elephant) != 1) {
            System.out.println("Test Four Failed!");
            return false;
        }
        else {
            System.out.println("Test FOUR PASSED!");
        }

        //Test Five:
        Tiger tiger1 = new Tiger(10,10,10);
        Tiger tiger2 = new Tiger(10,10,10);

        AnimalActivities.reproduce(tiger1, tiger2);

        return true;

    }

    /**
    * Testing whether all unit tests have passed
    *
    */
    public static void main(String[] args) {
        if (unitTests()) {
            System.out.println("All tests passed!\n");
        }
        else {
            System.out.println("Failed Tests\n");
            return;
        }
    }
}
