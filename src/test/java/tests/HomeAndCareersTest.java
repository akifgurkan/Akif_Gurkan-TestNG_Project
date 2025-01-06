package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeAndCareersPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.*;

public class HomeAndCareersTest {
    HomeAndCareersPage careersPage = new HomeAndCareersPage();

    @Test
    public void testHomeAndCareersPage() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        waitForPageToLoad(5);

        String expectedbaseUrl= "https://useinsider.com/";
        String actualbaseUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualbaseUrl, expectedbaseUrl, "URL validation failed!");

        // Click on Accept Cookies
        waitForClickablity(careersPage.acceptCookies,5).click();

        // Click on Company link
        waitForClickablity(careersPage.companyLink, 5).click();


       // Click on Careers link
        waitForClickablity(careersPage.careersLink,5).click();

        // Check if Careers page is opened
        String expectedCareersUrl = "https://useinsider.com/careers/";
        String actualCareersUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualCareersUrl, expectedCareersUrl, "Careers page URL validation failed!");

        // Check if Teams block is displayed
        scrollIntoPage(careersPage.seeAllTeamsButton);
        Assert.assertTrue(careersPage.seeAllTeamsButton.isDisplayed(), "Teams block is not displayed!");

        // Check if Locations block is displayed
        scrollIntoPage(careersPage.locationsBlock);
        Assert.assertTrue(careersPage.locationsBlock.isDisplayed(), "Locations block is not displayed!");

        // Check if Life at Insider block is displayed
        scrollIntoPage(careersPage.lifeAtInsiderBlock);
        Assert.assertTrue(careersPage.lifeAtInsiderBlock.isDisplayed(), "Life at Insider block is not displayed!");

        // close the driver
         Driver.closeDriver();

    }

}
