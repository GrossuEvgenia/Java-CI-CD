import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void helloSuccess(){
        Assertions.assertEquals("hello", Main.hello());
    }

    @Test
    void failTest(){
        Assertions.assertEquals(0,1);
    }
}
