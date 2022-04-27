package az.iktlab.groupj4web.service.impl.util.abstract_factory;

public class Bmw implements Car {

    @Override
    public void create() {
        System.out.println("Car : Bmw created");
    }
}
