package springboot.design.patterns.os.win;

import springboot.design.patterns.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
