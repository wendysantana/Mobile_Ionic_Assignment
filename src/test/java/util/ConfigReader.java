package util;

import javax.xml.soap.SAAJResult;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Mohammad Mutakim on 11/11/17.
 */
public class ConfigReader {

    private String url;
    private String chromeDriverPath;
    private String platform;
    private String version;
    private String sauceUsername;
    private String sauceKey;
    private String environment;
    private String sauceBrowser;

    //SauceLabs changes:
    //config.properties page (run_test, sauce_username, & sauce_key)
    //SharedSD page (if statement with configReader.getEnvironment to "sauce"

    //Website changes are made in config.properties page

    public ConfigReader() {

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.url = prop.getProperty("url");
            this.chromeDriverPath = prop.getProperty("chrome_driver_path");
            this.platform = prop.getProperty("platform");
            this.version = prop.getProperty("version");
            this.sauceUsername = prop.getProperty("sauce_username");
            this.sauceKey = prop.getProperty("sauce_key");
            this.environment = prop.getProperty("run_test");
            this.sauceBrowser = prop.getProperty("browser");


        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl() { return url; }
    public String getChromeDriverPath() { return chromeDriverPath; }
    public String getPlatform() {return platform;}
    public String getVersion() {return version;}
    public String getSauceUsername(){return  sauceUsername;}
    public String getSauceKey(){return sauceKey;}
    public String getEnvironment() {return environment;}
    public String getSauceBrowser(){return sauceBrowser;}

}
