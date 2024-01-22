package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class PracticeFormPage {

    WebDriver driver;
    WebElement firstNameInputField;
    WebElement lastNameInputField;
    WebElement emailInputField;
    WebElement genderMale;
    WebElement genderFemail;
    WebElement genderOther;
    WebElement mobileInputField;
    WebElement dateOfBirthInputField;
    WebElement subjectInputField;
    WebElement hobbies;
    WebElement pictureChoseFile;
    WebElement currentAddressTextarea;
    WebElement selectStateFromDropdownMenu;
    WebElement selectCityFromDropdownMenu;



    WebElement dateMonth;
    WebElement dateYear;
    WebElement dateDay;
    WebElement submitButton;


    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getFirstNameInputField() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameInputField() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailInputField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getGenderMale() {
        return driver.findElement(By.id("gender-radio-1"));
    }

    public WebElement getGenderFemale() {
        return driver.findElement(By.id("gender-radio-2"));
    }

    public WebElement getGenderOther() {
        return driver.findElement(By.id("gender-radio-3"));
    }

    public WebElement getMobileInputField() {
        return driver.findElement(By.id("userNumber"));
    }

    public WebElement getDateOfBirthInputField() {
        return driver.findElement(By.id("dateOfBirthInput"));
    }

    public WebElement getSubjectInputField() {
        return driver.findElement(By.cssSelector(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3"));
    }

    public List<WebElement> getHobbies() {
        return driver.findElements(By.cssSelector(".custom-control.custom-checkbox.custom-control-inline"));
    }

    public WebElement getPictureChoseFile() {
        return driver.findElement(By.id("uploadPicture"));
    }

    public WebElement getCurrentAddressTextarea() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getSelectStateFromDropdownMenu() {
        return driver.findElement(By.id("state"));
    }

    public WebElement getSelectCityFromDropdownMenu() {
        return driver.findElement(By.id("city"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getDateMonth() {
        return driver.findElement(By.className("react-datepicker__month-select"));
    }

    public WebElement getDateYear() {
        return driver.findElement(By.className("react-datepicker__year-select"));
    }

    public WebElement getDateDay() {
        return driver.findElement(By.cssSelector("role=['option']"));
    }

    //---------------


    public void firstNameInputField(String firstName) {
        getFirstNameInputField().clear();
        getFirstNameInputField().sendKeys(firstName);
    }

    public void inputLastname(String lastName) {
        getLastNameInputField().clear();
        getLastNameInputField().sendKeys(lastName);
    }

    public void inputEmail(String email) {
        getEmailInputField().clear();
        getEmailInputField().sendKeys(email);
    }

    public void clickOnGenderRadiobutton(String genderValue) {
        WebElement genderSelected = null;

       if(genderValue.equalsIgnoreCase("male")) {
           genderSelected = getGenderMale();
       } else if(genderValue.equalsIgnoreCase("female")) {
           genderSelected = getGenderFemale();
       } else {
           genderSelected = getGenderOther();
       }

       if(genderSelected != null) {
           JavascriptExecutor executor = (JavascriptExecutor) driver;
           executor.executeScript("arguments[0].click();", genderSelected);
       }
    }


    public void mobilePhoneInput(String phoneNum) {
        getMobileInputField().clear();
        getMobileInputField().sendKeys(phoneNum);
    }


    //1.nacin:
    public void chooseDateOfBirth(String date) {
        getDateOfBirthInputField().sendKeys(Keys.CONTROL + "a");
        getDateOfBirthInputField().sendKeys(date);
        getDateOfBirthInputField().sendKeys(ENTER);
    }


    //2.Nacin:
//    public void chooseDateOfBirth2(String month, String year, String day) {
//        Select selectMonth = new Select(getDateMonth());
//        selectMonth.selectByValue(month);
//
//        Select selectYear = new Select((getDateYear()));
//        selectYear.selectByValue(year);
//
//        Select selectDay = new Select(getDateDay());
//        selectDay.selectByValue(day);
//    }

    public void submitButton() {
        getSubmitButton().click();
    }



}
