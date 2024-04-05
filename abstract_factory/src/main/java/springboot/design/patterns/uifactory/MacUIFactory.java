package springboot.design.patterns.uifactory;

import springboot.design.patterns.Button;
import springboot.design.patterns.CheckBox;
import springboot.design.patterns.os.mac.MacButton;
import springboot.design.patterns.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
