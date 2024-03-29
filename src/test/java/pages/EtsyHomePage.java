package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import java.util.List;

public class EtsyHomePage {

    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //changes
    //added
    //added 1
    //added 2
    //added 3

    @FindBy(css = "ul[data-ui='top-nav-category-list'] a")
    public List<WebElement> mainNavigationItems;
}
