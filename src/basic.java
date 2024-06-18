import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class basic extends base {
public static void main(String[] args) throws MalformedURLException {
    // Set the desired capabilities
	AndroidDriver<AndroidElement> driver = capabilities();

    // Wait for the app to load
    try {
        Thread.sleep(5000); // Wait for 5 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Perform the calculation: 3 + 3
    driver.findElement(By.id("com.dicoding.junittest:id/btn3")).click();
    driver.findElement(By.id("com.dicoding.junittest:id/btnAdd")).click();
    driver.findElement(By.id("com.dicoding.junittest:id/btn3")).click();
    driver.findElement(By.id("com.dicoding.junittest:id/btnEqual")).click();

    // Get the result from the TextView
    String result = driver.findElement(By.id("com.dicoding.junittest:id/resultTextView")).getText();

    // Print the result
    System.out.println("Result: " + result);

    // Close the driver
 // driver.quit();
 	}
 }