package Utils;

import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.Scenario;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@Getter @Setter @ScenarioScoped
public class TestContext {
    WebDriver driver;
    Scenario scenario;
}
