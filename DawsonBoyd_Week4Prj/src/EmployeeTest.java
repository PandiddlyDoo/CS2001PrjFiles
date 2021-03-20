/**Employee Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci2001
 */

public class EmployeeTest {

    public static void main(String[] args) {
        Employee me = new Employee("Dawson", "Boyd", 700);
        Employee you = new Employee("Charles", "Gorrill", 6000);

        //Displaying yearly salary without raise
        System.out.printf("My yearly salary: %.2f%n", (me.getSalary()*12));
        System.out.printf("Your yearly salary: %.2f%n", (you.getSalary()*12));

        //Giving a 10% raise
        me.setSalary(me.getSalary()*1.1);
        you.setSalary(you.getSalary()*1.1);

        //Printing yearly salary with raise. Im not sure why java doesn't reserve the "\" to escape in printf but some googling helped me figure it out.
        System.out.printf("My yearly salary with 10%% raise: %.2f%n", (me.getSalary()*12));
        System.out.printf("Your yearly salary with 10%% raise: %.2f%n", (you.getSalary()*12));
    }
}
