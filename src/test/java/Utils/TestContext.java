package Utils;

import io.cucumber.java.Scenario;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
@Getter @Setter
public class TestContext {
    WebDriver driver;
    Scenario scenario;
}
