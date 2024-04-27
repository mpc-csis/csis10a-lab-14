
/**
 * Write a description of class Inheritance here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("\f");
        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
    }

    public static void problem1() {
        // *--------------- Prob 1 --------------------------
        // create an object of type animal and print it out
        Animal critter = new Animal();
        System.out.println("critter = " + critter);

        // listen to the critter speak

        // set the number of legs of critter to 18
        critter.setLegs(18);

        // print the contents of critter
        System.out.println("critter = " + critter);

        // create an object of type pet and print it out
        Pet buffy = new Pet();
        System.out.println("buffy = " + buffy);

        // set the number of legs of buffy to 8

        // set the number of fleas on buffy to 2

        // print the contents of buffy
        System.out.println("buffy = " + buffy);

        // can you assign an Animal object to a Pet variable ?
        // try setting buffy = critter. does it work?
        // after your test, comment out the line you wrote

        // can you assign a Pet object to an Animal variable?
        // try setting critter = buffy

        // since critter now refers to a Pet can you set the number
        // of fleas on critter?

        // ----------------End Prob 1 ------------------------*/
    }

    public static void problem2() {
        // *--------------- Prob 2 --------------------------
        // Define a Dog class that inherits from Pet (#fleas = 8)
        // override the speak method so it sounds like a dog
        // Create a dog object, print the contents of your dog
        // and listen to it speak

        // ----------------End Prob 2 ------------------------*/
    }

    public static void problem3() {
        // *--------------- Prob 3 --------------------------
        // Define a Cat class that inherits from Pet (#fleas = 4)
        // override the speak method so it sounds like a cat
        // Create a cat object, print the contents of your cat
        // and listen to it speak

        // ----------------End Prob 3 ------------------------*/
    }

    public static void problem4() {
        // *--------------- Prob 4 --------------------------
        // Define a Human class that inherits from Animal (#legs = 2)
        // override the speak method so it sounds like a human
        // Create a Human object, print the contents of your human
        // and listen to it speak

        // ----------------End Prob 4 ------------------------*/
    }

    public static void problem5() {
        // *--------------- Prob 5 --------------------------
        // create an array of 5 Animal objects called zoo
        // Since a Human, Pet, Cat or Dog object IS An Animal
        // they can all be assingend to an Animal array index.

        // assign one Animal, one Human, one Pet, one Cat, and one Dog
        // to the zoo array

        // Write a for loop that visits each animal and listens
        // to it speak
        System.out.println("The zoo animals are talking! Listen: ");

        // ----------------End Prob 5 ------------------------*/
    }
}
