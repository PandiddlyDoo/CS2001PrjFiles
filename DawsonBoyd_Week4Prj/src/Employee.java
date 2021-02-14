public class Employee {

    private String fName, lName;
    private double salary;

    //Our constructor to build an employee
    public Employee(String fName, String lName, double salary){

        this.fName=fName;
        this.lName=lName;
        if (salary >= 0){
            this.salary=salary;
        }

    }

    //Getters and setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
