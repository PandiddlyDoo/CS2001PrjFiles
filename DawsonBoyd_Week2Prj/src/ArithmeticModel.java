public class ArithmeticModel {

    //All float for the sake of proper division/ use of decimals
    private float op1, op2, sum, difference, product, quotient;

    public ArithmeticModel(float op1, float op2, float sum, float difference, float product, float quotient) {
        this.op1 = op1;
        this.op2 = op2;
        this.sum = sum;
        this.difference = difference;
        this.product = product;
        this.quotient = quotient;
    }

    public float sumOperands(){
        return op1+op2;
    }

    public float subtractOperands(){
        return op1-op2;
    }

    public float multiplyOperands(){
        return op1*op2;
    }

    public float divideOperands(){
        return op1/op2;
    }

    public void setOp1(float op1) {
        this.op1 = op1;
    }

    public void setOp2(float op2) {
        this.op2 = op2;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public float getDifference() {
        return difference;
    }

    public void setDifference(float difference) {
        this.difference = difference;
    }

    public float getProduct() {
        return product;
    }

    public void setProduct(float product) {
        this.product = product;
    }

    public float getQuotient() {
        return quotient;
    }

    public void setQuotient(float quotient) {
        this.quotient = quotient;
    }
}
