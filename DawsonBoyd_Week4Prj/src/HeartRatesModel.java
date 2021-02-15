public class HeartRatesModel {
    private String fName, lName;
    private int month, day, year;

    public HeartRatesModel(String fName, String lName, int month, int day, int year) {
        this.fName = fName;
        this.lName = lName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge(){
        return 2021-year;
    }

    public int getMaxHeartRate(){
        return year-1801;
    }

    public double getLowerHeartRate(){
        return 0.5*(year-1801);
    }
    public double getUpperHeartRate(){
        return 0.85*(year-1801);
    }
}
