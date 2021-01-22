public class RunFormFrame {

    public static void main(String[] args) {
        FormView view = new FormView();
        FormModel model=new FormModel(null, null, null, null);
        FormControl control=new FormControl(view, model);
    }
}
