package deleteatests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import deletea.pageobjects.GoogleFirstpagePO;
import deletea.pageobjects.googlelandingPO;

public class Googlelandingpage extends BaseClass {

	googlelandingPO googlelanding;
	GoogleFirstpagePO googlefirstpagePO;

	@BeforeTest
	public void initalizebrowser() throws InterruptedException, IOException {

		initialisebrowser();
		googlelanding = new googlelandingPO(driver);
		googlefirstpagePO = new GoogleFirstpagePO(driver);

	}

	@Test(priority = 1)
	public void entername() throws InterruptedException {
		googlelanding.googleentername("sachin");
		googlefirstpagePO.selectmorebutton();
		googlefirstpagePO.selectsectionundermore("Books");

	}

	@Test(priority = 2)
	public void seletingelement() {
		googlefirstpagePO.scrollandselect(8000);
	}
}
