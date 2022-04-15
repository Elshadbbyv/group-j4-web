package az.iktlab.groupj4web.util.diaandic.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Main {

    private final HumanController humanController;

    public Main(HumanController humanController) {
        this.humanController = humanController;
    }

    public void main(String[] args) {

        humanController.add();
    }
}
