package springboot.design.patterns.os.mac;

import springboot.design.patterns.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
