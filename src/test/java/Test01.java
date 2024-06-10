import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Test01{
    @Test
    void MyTest(){
        open("http://92.51.36.108:7777/tatyana.naumova/index.html");
        sleep(5000);
    }
}
