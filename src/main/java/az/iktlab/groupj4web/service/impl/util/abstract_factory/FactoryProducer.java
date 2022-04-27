package az.iktlab.groupj4web.service.impl.util.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory() {
        return new CarFactory();
    }
}
