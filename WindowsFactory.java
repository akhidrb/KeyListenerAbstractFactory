public class WindowsFactory implements AbstractFactory {

    public Button createButton() {
        return new WindowsButton();
    }

    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

}