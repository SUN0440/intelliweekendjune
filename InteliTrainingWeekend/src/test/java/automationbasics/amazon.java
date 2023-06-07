package automationbasics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class amazon {
    public static void main(String[] args)  {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com/uk/");
    }


}
