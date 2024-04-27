/**
 * class OOP -- further exercises in Object Oriented Programming
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OOP {

    static Employee boss = new Employee("Sonia Winderhaven", 12345, 55000);
    static Employee newGuy = new Employee("Jasper John", 44444, 41000);
    static Employee imposter = new Employee("Jasper John", 44444, 41000);

    public static void main(String[] args) {
        System.out.println("\f");
        problem1();
        problem2();
        problem3();
        problem4();
    }

    public static void problem1() {

        // ======= Problem 1 Add Object Methods to Employee Class ============

        // a) In the Employee class write the definition of print, equals and toString
        // where indicated. If you did this step correctly this code should run
        // without being modified.

        Employee.printEmployee(newGuy); // print using class method printEmployee
        newGuy.print(); // print using the object method print

        // b) print the object newGuy using the toString object method (implicit call)
        System.out.println("newGuy = " + newGuy);

        // c) use the equals method to compare the objects, newGuy and boss

        if (newGuy.equals(boss)) {
            System.out.println("newGuy equals boss [Error]");
        } else {
            System.out.println("newGuy differs from boss [correct]");
        }

        // d) use the equals method to compare the objects
        // newGuy and imposter, and print the result as in c)

        // ------- End Problem 1 ------------------------------------*/
    }

    public static void problem2() {

        // ======= Problem 2 Encapsulation ============

        // a) Now add the word private in front of the instance variables for Employee
        // and define the methods getName, getID, getSalary, setName, setID, setSalary
        // where indicated. Then use the setSalary method to change the salary of
        // newGuy to 88000 here:

        System.out.println("After using setSalary, newGuy = " + newGuy);

        // b) Print only the name fields of newGuy, boss, and imposter

        // c) With one command, give a $1000 raise to imposter
        // (use composition to set the salary to 1000 + the getSalary value)

        // System.out.println("Before his raise, imposter's salary = " +
        // imposter.getSalary());

        // System.out.println("After his raise, imposter's salary = " +
        // imposter.getSalary());

        // ------- End Problem 2 ------------------------------------

    }

    public static void problem3() {

        // ======= Problem 3 Arrays of Employee Objects ============
        // a) Make an array of 6 Employee objects called startup
        // and set its values equal to 6 fictitious Employees

        // b) Define the method printAllEmployees where indicated below main
        // then activate the following statements:

        System.out.println("Here are the Employees at startup.com :");
        // printAllEmployees(startup);

        // c) set the salary of the last Employee object to the
        // salary of the first Employee object.
        // Prove that the change took effect

        // d) In the Employee class, there is a class method called compareEmployee
        // Copy this method and paste it up higher where the object method
        // compareTo is indicated. Then modify the method, turning it into
        // an object method (change the name to compareTo).
        // Then test by activating these lines:

        // System.out.println("boss compared to newGuy = " + boss.compareTo(newGuy));
        // if (boss.compareTo(newGuy) < 0)
        // System.out.println(boss.getName() + " comes before " + newGuy.getName());
        // else if (boss.comareTo[newGuy] > 0)
        // System.out.println(boss.getName() + " comes after " + newGuy.getName());
        // else
        // System.out.println(boss.getName() + " and " + newGuy.getName() + " are the
        // same));

        // ------- End Problem 3 ------------------------------------

    }

    public static void problem4() {

          //======= Problem 4 Bubble Sort an Array of Employees ============
          
          // The easiest way to sort an array is to compare two adjacent entries.
          // If the second one comes before the first, you can swap them using
         // the call: swap(startup,3,0); // swaps contents of index 3 and 0 in startup
          // (swap is defined below main)
          
          // the basic idea can be illustrated with the following code:
          /* 
          if ( startup[0].compareTo(startup[1] > 0) { // true if index0 is larger than index1
              swap(startup, 0, 1);                    // exchange the contents of cells 0 and 1
          }
          */
          
          //printAllEmployees(startup);
          
          //a) Write a for loop that traverses from index 0 to index 4 inclusive
          // (in general this would go from 0 to 2 less than the length of the array)
          // Inside the loop body, if ever the employee at index k is greater than
          // the one at k+1, swap them. Otherwise move on to the next cell.
          
          
          System.out.println("after one pass of bubble sort, startup = " );
          //printAllEmployees(startup);
          
          
          //b) Write another (nested) loop around the code for a) above.
          // This loop should repeat n times where n = the length of startup array.
          // Make sure to include both the for loop and the print statements above
          // in the body of the loop so you can watch the array after each pass of the sort.
          
          System.out.println("after sorting all employees, startup = " );
          //printAllEmployees(startup);
          
          
          //------- End Problem 4 ------------------------------------
         
    }

    // 3b) Define method printAllEmployees here, takes an array parameter,
    // prints out all the Employees in the array.

    /**
     *
     * @param array
     * @param pos1
     * @param pos2
     */
    public static void swap(Employee[] array, int pos1, int pos2) {
        Employee temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
