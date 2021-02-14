public class InvoiceModel {

    private String number, description;
    private int quantity;
    private double price;

    //constructor checking for negatives
    public InvoiceModel(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;

        if(quantity<0) {
            this.quantity = 0;
        }
        if(quantity>=0){
            this.quantity = quantity;
        }

        if (price<=0.0){
            this.price=0.0;
        }
        if (price>0.0){
            this.price=price;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }
    //setters also checking
    public void setQuantity(int quantity) {
        if(quantity<0) {
            this.quantity = 0;
        }
        if(quantity>=0){
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }
    //setters also checking
    public void setPrice(double price) {
        if (price<=0.0){
            this.price=0.0;
        }
        if (price>0.0){
            this.price=price;
        }
    }

    //getInvoiceAmount method
    public double getInvoiceAmount(){
        return price * quantity;
    }
}
