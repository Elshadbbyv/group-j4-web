package az.iktlab.groupj4web.service.impl.util.dao;

public class Main {

    public static void main(String[] args) {

        PersonRepository repository = new PersonRepository();
        PersonService service = new PersonService(repository);
        PersonController controller = new PersonController(service);

        System.out.println(controller);
    }
}
