package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.SearchbarPage;

public class SearchbarTest extends Baseclass {

	@Test
	public void product() {

		SearchbarPage search = new SearchbarPage(driver);
		search.Search("Iphone 14 pro max 256gb gold colour");
		Switchclass();
		search.Buything();
	}
}
