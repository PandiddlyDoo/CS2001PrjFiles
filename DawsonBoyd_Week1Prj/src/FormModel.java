public class FormModel {
    private String fName, lName, eAdd, hAdd, name;

    public FormModel(String fName, String lName, String eAdd, String hAdd) {
        this.fName = fName;
        this.lName = lName;
        this.eAdd = eAdd;
        this.hAdd = hAdd;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String combineNames(){
        return fName +" " + lName;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getEAdd() {
        return eAdd;
    }

    public void setEAdd(String eAdd) {
        this.eAdd = eAdd;
    }

    public String getHAdd() {
        return hAdd;
    }

    public void setHAdd(String hAdd) {
        this.hAdd = hAdd;
    }

}
