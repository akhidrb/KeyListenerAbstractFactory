public class LinuxFactory implements AbstractFactory {
    
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
    
    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}