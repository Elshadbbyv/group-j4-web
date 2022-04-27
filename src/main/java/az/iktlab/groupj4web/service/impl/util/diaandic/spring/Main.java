package az.iktlab.groupj4web.service.impl.util.diaandic.spring;

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
