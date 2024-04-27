/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee {

    // --- instance variables ---------------------------------------
    int id;
    String name;
    double salary;

    /**
     * defined the no-arg constructor here
     * (Set name to "-----", id to 0, salary to 0
     * Constructs ...
     */
    public Employee() {
        name = "------";
        id = 0;
        salary = 0;
    }

    /**
     * defined the constructor with arguments here. Constructs ...
     *
     * @param name
     * @param id
     * @param salary
     */
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // --- OBJECT METHODS for problem 1 -----------------------------
    // make the object method print()

    // make the object method toString()

    // make the object method equals()
    // only check if the ID's are equal

    // --- OBJECT METHODS for problem 2 -----------------------------
    // make the accessor method getName

    // make the accessor method getID

    // make the accessor method getSalary

    // make the modifier method setName

    // make the modifier method setID

    // make the modifier method setSalary

    // --- OBJECT METHODS for problem 3 -----------------------------
    // make the method compareTo

    // --- CLASS METHODS --------------------------------------------

    /**
     * defined the compareEmployee method here
     * (compare by their names, use the String compareTo method
     * to compare just the names of both employees)
     * 
     * @param e1
     * @param e2
     * @return
     */
    public static int compareEmployee(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }

    /**
     * defined the printEmployee method here
     * 
     * @param e
     */
    public static void printEmployee(Employee e) {
        System.out.println("Name: " + e.name + ", ID: " + e.id + ", Salary: " + e.salary);
    }

    /**
     * defined the sameEmployee method here
     * 
     * @param e1
     * @param e2
     * @return
     */
    public static boolean sameEmployee(Employee e1, Employee e2) {
        return e1.name.equals(e2.name) && (e1.id == e2.id) && (e1.salary == e2.salary);
    }
}
