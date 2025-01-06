package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QAJobsAndApplicationPage {

    public QAJobsAndApplicationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btn btn-outline-secondary rounded text-medium mt-2 py-3 px-lg-5 w-100 w-md-50'][contains(text(),'See all QA jobs')]")
    public WebElement seeAllQAJobsButton;

    @FindBy(css = "#select2-filter-by-location-container")
    public WebElement locationAllDropdown;

    @FindBy(xpath = "//li[contains(@id, 'Istanbul')]")
    public WebElement istanbulOption;

    @FindBy(xpath = "//*[@id=\"select2-filter-by-department-container\"]")
    public WebElement departmentAllDropdown;

    @FindBy(xpath = "//li[contains(@id, 'Quality Assurance')]")
    public WebElement qualityAssuranceOption;

    @FindBy(xpath = "//*[@id=\"career-position-list\"]/div/div/div[1]")
    public WebElement resultCounter;

    @FindBy(xpath = "//*[@id=\"jobs-list\"]/div[1]/div/span")
    public WebElement resultJobTitle1;

    @FindBy(xpath = "//*[@id=\"jobs-list\"]/div[1]/div/div")
    public WebElement resultJobLocation1;

    @FindBy(xpath = "//*[@id=\"jobs-list\"]/div[2]/div/span")
    public WebElement resultJobTitle2;

    @FindBy(xpath = "//*[@id=\"jobs-list\"]/div[2]/div/div")
    public WebElement resultJobLocation2;

    @FindBy(xpath = "//*[@id=\"jobs-list\"]/div[3]/div/span")
    public WebElement resultJobTitle3;

    @FindBy(xpath = "//*[@id=\"jobs-list\"]/div[3]/div/div")
    public WebElement resultJobLocation3;

    @FindBy(xpath = "//a[text()='View Role']\n")
    public WebElement wievRole;

}
