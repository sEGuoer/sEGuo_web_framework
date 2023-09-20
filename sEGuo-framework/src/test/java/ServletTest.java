import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServletTest {
    @Test
    void lifeCycle(){
        Assertions.assertNotNull("listener->构造器->init->service(可以多次)->destroy");
    }
}
