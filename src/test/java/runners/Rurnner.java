package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)   //classi cucumber ile calistir.

@CucumberOptions(

//        plugin = "html:target/cucumber", // html raporlarini almamizi sagler. plugin = eklenti
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },


        features = "src/test/resources/features",
        glue = "stepdefinitions", //stepdefinitions ile features arasinda baglanti saglamak icin. glue = tutkal

//        tags = "@teapot", // hangisini calistirmak istiyorsak onun tag'ini yazarak sadece onu calistirabiliriz.
//        tags = "@fhcloginparameter or @teapot", // araya or yazarak birden fazla tag'i run edebiliriz.
        tags = "@fhclogin",
        //aradaki tum islemlerin sonuna (,) koyuyoruz. (;) yerine. dryRun'a ise hicbir sey koymuyoruz.
        dryRun = false // true yaptigimizda browser calismadan run ettigi icin cok hizli cilisiyor. eksik stepdefinitions arar.
        // koymazsek yada false yazarsek browser actigi icin yavas. ve eksik stepdefinitions arar.
)



public class Rurnner {

}
