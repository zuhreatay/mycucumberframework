package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    //Bu classin amaci configration.properties dosyasindaki verileri (test data) okumaktir.
    //creat Properties instance
    private static Properties properties;
    //FileInputStream kullanarak, bir dosya aciyoruz
    //Properties'i bu dosyaya yukluyoruz
    //daha sonra properties dosyasini okuyacagiz

    //baslatmak icin static blok olusturduk.
    static {
        String path= "configuration.properties";//proje levilinda olusturuldugundan path ini bu sekilde kisa yapistirabiliriz
        try {
            FileInputStream file= new FileInputStream(path);
            properties= new Properties();
            properties.load(file);
        } catch (Exception e) {
            System.out.println("file path bulunamadi");
            e.printStackTrace();
        }
    }
    //okumak icin static bir method olusturalim
    //Bu method kullanici anahtar kelimeyi girdiginde(key), value return eder.
    public static String getProperty(String key){
        return properties.getProperty(key);
    }



}


