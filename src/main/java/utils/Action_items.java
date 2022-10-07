package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action_items {
	WebDriver driver;
//	List<WebElement> element;

	public Action_items(WebDriver driver) {
		this.driver = driver;

	}

	public void explicitwait(List<WebElement> element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public void explicitwait(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public void selectingelementfromlist(List<WebElement> element, String name) {
		for (int i = 0; i < element.size(); i++) {
			if (element.get(i).getText().contains(name)) {
				element.get(i).click();
				break;
			}
		}
	}

	public void JavaScriptExecutor(int axis) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + axis + ")");

	}

}
