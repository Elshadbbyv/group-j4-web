package az.iktlab.groupj4web.service.impl.util.diaandic.manual;

public class Main {

    public static void main(String[] args) {

        HumanRepositoryV2 humanRepositoryV2 = new HumanRepositoryV2();
        HumanRepository humanRepository = new HumanRepository();
        HumanService humanService = new HumanService(humanRepository, humanRepositoryV2);
        HumanController humanController = new HumanController(humanService);

        humanController.add();
    }
}
