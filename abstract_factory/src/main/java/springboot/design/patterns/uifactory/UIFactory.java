package springboot.design.patterns.uifactory;

import springboot.design.patterns.Button;
import springboot.design.patterns.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
