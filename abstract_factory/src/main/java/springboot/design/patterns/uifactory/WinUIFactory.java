package springboot.design.patterns.uifactory;


import springboot.design.patterns.Button;
import springboot.design.patterns.CheckBox;
import springboot.design.patterns.os.win.WinButton;
import springboot.design.patterns.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
