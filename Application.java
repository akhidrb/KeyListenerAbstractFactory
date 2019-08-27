public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(AbstractFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void build() {
        button.build();
        checkBox.build();
    }

}