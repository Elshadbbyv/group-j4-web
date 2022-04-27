package az.iktlab.groupj4web.service.impl.util.facade;

public class Main {

    public static void main(String[] args) {

        HumanService service = new HumanServiceImpl();
        service.read("Hello Design Patterns");

    }
}