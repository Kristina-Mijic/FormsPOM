package Tests;

import Base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forms extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.get("https://demoqa.com/");
    }

    @Test
    public void userCanFillFormWithJustMandatoryFields() {
        homePage.clickOnCard("Forms");
        sidebarPage.clickOnItemFromSidebar("Practice Form");
        practiceFormPage.firstNameInputField("Kristina");
        practiceFormPage.inputLastname("Mijic");
        practiceFormPage.inputEmail("test@gmail.com");
        practiceFormPage.clickOnGenderRadiobutton("Female");
        practiceFormPage.mobilePhoneInput("1234567890");
        practiceFormPage.chooseDateOfBirth("26 Dec 1994");
        practiceFormPage.submitButton();
    }

    @Test
    public void userCanFillFormsWithExcelFile() {
        String usernameField = excelReader.getStringData("Forms", 1, 0);
        String passwordField = excelReader.getStringData("Forms", 1, 1);

        practiceFormPage.firstNameInputField(usernameField);

    }
}
