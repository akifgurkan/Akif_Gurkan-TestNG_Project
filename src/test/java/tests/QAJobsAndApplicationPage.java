package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeAndCareersPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class QAJobsAndApplicationPage {

    pages.QAJobsAndApplicationPage qAJobsAndApplicationPage = new pages.QAJobsAndApplicationPage();
    HomeAndCareersPage careersPage = new HomeAndCareersPage();


    @Test
    public void testQAJobsAndApplicationPage() {
        Driver.getDriver().get(ConfigReader.getProperty("qualityAssuranceUrl"));
        waitForPageToLoad(5);

        // Click on Accept Cookies
        waitForClickablity(careersPage.acceptCookies, 5).click();

        // Click on See all QA jobs button
        waitForClickablity(qAJobsAndApplicationPage.seeAllQAJobsButton, 5).click();

        // Click on Location All dropdown
        ReusableMethods.wait(8);
        waitForClickablity(qAJobsAndApplicationPage.locationAllDropdown, 5).click();

        // Click on Istanbul option
        waitForClickablity(qAJobsAndApplicationPage.istanbulOption, 5).click();

        // Click on Department All dropdown
        waitForClickablity(qAJobsAndApplicationPage.departmentAllDropdown, 5).click();

        // Click on Quality Assurance option
        waitForClickablity(qAJobsAndApplicationPage.qualityAssuranceOption, 5).click();

        // Check if result counter is displayed
        scrollIntoPage(qAJobsAndApplicationPage.resultCounter);
        Assert.assertTrue(qAJobsAndApplicationPage.resultCounter.isDisplayed(), "Result counter is not displayed!");

        // Check if result job title is displayed
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        ReusableMethods.wait(2);
        Assert.assertTrue(qAJobsAndApplicationPage.resultJobTitle1.isDisplayed(), "Result job title is not displayed!");

        // Check if result job location is displayed
        Assert.assertTrue(qAJobsAndApplicationPage.resultJobLocation1.isDisplayed(), "Result job location is not displayed!");

        // Check if result job title is displayed
        Assert.assertTrue(qAJobsAndApplicationPage.resultJobTitle2.isDisplayed(), "Result job title is not displayed!");

        // Check if result job location is displayed
        Assert.assertTrue(qAJobsAndApplicationPage.resultJobLocation2.isDisplayed(), "Result job location is not displayed!");

        // Check if result job title is displayed
        Assert.assertTrue(qAJobsAndApplicationPage.resultJobTitle3.isDisplayed(), "Result job title is not displayed!");

        // Check if result job location is displayed
        Assert.assertTrue(qAJobsAndApplicationPage.resultJobLocation3.isDisplayed(), "Result job location is not displayed!");

        //  Click the “View Role” button and check that this action redirects us to the Lever Application form page
        ReusableMethods.wait(2);
        ReusableMethods.hover(qAJobsAndApplicationPage.wievRole);
        waitForClickablity(qAJobsAndApplicationPage.wievRole, 5).click();

        for (String windowHandle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(windowHandle);
        }

        String expectedbaseUrl = "https://jobs.lever.co/useinsider/78ddbec0-16bf-4eab-b5a6-04facb993ddc";
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedbaseUrl, "URL validation failed!");

        // close the driver
        Driver.quitDriver();
    }

}
