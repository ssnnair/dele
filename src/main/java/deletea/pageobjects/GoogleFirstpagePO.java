package deletea.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Action_items;

public class GoogleFirstpagePO extends Action_items {

	WebDriver driver;

	public GoogleFirstpagePO(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//descendant::g-menu[@jsname='xl07Ob'][3]//div//a")
	private List<WebElement> sections;

	@FindBy(xpath = "//div[@jsname='LgbsSe']")
	private WebElement more;

	public void selectmorebutton() throws InterruptedException {
		explicitwait(more, 10);
		more.click();

	}

	public void selectsectionundermore(String name) {
		explicitwait(sections, 10);
		selectingelementfromlist(sections, name);

	}

	public void scrollandselect(int x) {
		JavaScriptExecutor(x);

	}
}
