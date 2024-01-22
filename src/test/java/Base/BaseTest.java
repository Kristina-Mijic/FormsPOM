package Base;

import Pages.HomePage;
import Pages.PracticeFormPage;
import Pages.SidebarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    public WebDriver driver;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public PracticeFormPage practiceFormPage;

    public ExcelReader excelReader;

    @BeforeMethod
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        sidebarPage = new SidebarPage(driver);
        practiceFormPage = new PracticeFormPage(driver);
        excelReader = new ExcelReader("C:\\Users\\Kristina\\Desktop\\TableData.xlsx");
    }
}
