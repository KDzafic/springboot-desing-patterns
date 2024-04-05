package springboot.design.patterns;

import springboot.design.patterns.uifactory.UIFactory;

public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
