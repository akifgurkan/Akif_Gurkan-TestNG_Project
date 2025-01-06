package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomeAndCareersPage {
    public HomeAndCareersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink' and normalize-space(.)='Company']")
    public WebElement companyLink;

    @FindBy(xpath = "//*[@id=\"wt-cli-accept-all-btn\"]")
    public WebElement acceptCookies;

    @FindBy(xpath = "//a[contains(@href, 'careers') and normalize-space()='Careers']")
    public WebElement careersLink;

    // @FindBy(css = "a.btn.btn-outline-secondary")
    @FindBy(xpath = "//a[contains(text(), 'See all teams') and contains(@class, 'btn-outline-secondary')]")
    public WebElement seeAllTeamsButton;

    @FindBy(xpath = "//h3[contains(text(), 'Our Locations')]")
    public WebElement locationsBlock;

    @FindBy(xpath = "//h2[normalize-space(.)='Life at Insider']")
    public WebElement lifeAtInsiderBlock;


}


