package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //Driver class, driver instance'i baslatmak icin kullanilir(Sinngleton Driver)
    //Ihtiyacimiz oldugunda driver'i kurmak ve baslatmak icin kullaniyoruz
    //Driver null oldugunda (yani yoksa) creat edip baslaticaz.(if driver==null)
    //Driver classi farkli browser'lar ile de kullanacagimiz sekilde olusturacagiz

    //contractor olusturalim, baska obje olusturulmasini istemedigimiz icin creat ediyoruz
    private Driver(){

    }
    //driver instance olusturalim
    static WebDriver driver;

    //driver'i baslatmak icin static bir method olusturalim
    public static WebDriver getDriver(){

        if(driver==null){
            switch(ConfigurationReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;
                case ("firefox"):
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver= new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver= new SafariDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }
    public  static  void closeDriver(){
        if(driver!=null){  //eger driver chrome u isaret ediyorsa
            driver.quit();  //driver i kapat
            driver=null;  //driver'in null oldugundan emin olmak icin tekrar null olarak atiyalim
            //boylece driver'i tekrar baslatabilirim
        }                //Multi Browser Test(Chrome, firefox , ie...) yaparken bu onemli olacaktir.
    }

}


