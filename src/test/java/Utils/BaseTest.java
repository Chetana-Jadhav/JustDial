package Utils;

import org.testng.Assert;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected String url;
    protected String msg ;
    protected String msg2 ;
    protected String SearchInput1 ;
    protected String SearchInput2 ;

    public BaseTest() {
        readProperties();
    }

    public void readProperties() {
        try{
            Properties properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
            this.url = (String) properties.get("url");
            this.msg = (String) properties.get("msg");
            this.msg2 = (String) properties.get("msg2");
            this.SearchInput1 = (String) properties.get("SearchInput1");
            this.SearchInput2 = (String) properties.get("SearchInput2");

        }catch (Exception e){
            Assert.fail("Config.properties file not found");
        }
    }
}
