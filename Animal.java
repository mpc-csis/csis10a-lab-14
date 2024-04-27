/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal {

    private boolean brain;
    private int legs;

    /**
     * Constructs ...
     */
    public Animal() {
        brain = true;
        legs = 0;
    }

    /**
     * @return
     */
    public int getLegs() {
        return legs;
    }

    /**
     *
     * @param legs
     */
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     */
    public void speak() {
        System.out.println("Undifferentiated Animal Noise");
    }

    /**
     * @return
     */
    public String toString() {
        return "Animal: legs = " + getLegs();
    }
}
