package springboot.design.patterns.os.win;

import springboot.design.patterns.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
