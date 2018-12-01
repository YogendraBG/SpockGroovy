
/*
	This is the Geb configuration file.
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities

// disabling javascript this way doesnt work :(
// need to use htmlunitdriver insted
//def caps = new DesiredCapabilities(["javascriptEnabled": Boolean.TRUE.equals(Boolean.valueOf(System.getProperty("geb.disableJavascript"))) ? false : true,
//        "takeScreenshot": true])


driver = {
    System.setProperty('webdriver.chrome.driver', driverUrl)
    new ChromeDriver()

}


def caps = new DesiredCapabilities([
        "javascriptEnabled": true,
        "takeScreenshot": true])

driverUrl = "src/main/resources/chromedriver.exe"


reportsDir = new File("target/geb-reports")
atCheckWaiting = true

waiting {
    timeout = 15
    retryInterval = 1.0
}

baseUrl ="http://www.google.com"

