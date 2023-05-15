package observerPattern.test;

import observerPattern.interfaces.Observer;
import observerPattern.models.ConcreteObserver;
import observerPattern.models.ConcreteSubject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestObserver {

    private Observer observer1;
    private Observer observer2;
    private ConcreteSubject concreteSubject;

    @Before
    public void initialize(){
        observer1 = new ConcreteObserver("Observer 1");
        observer2 = new ConcreteObserver("Observer 2");

        concreteSubject = new ConcreteSubject();
    }

    // Test has being implemented
    @Test
    public void testObserver(){
        concreteSubject.addObserver(observer1);
        concreteSubject.addObserver(observer2);
        concreteSubject.setState("Update state has successfully");
    }
}
