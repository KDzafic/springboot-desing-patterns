package springboot.design.patterns.os.mac;

import springboot.design.patterns.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
