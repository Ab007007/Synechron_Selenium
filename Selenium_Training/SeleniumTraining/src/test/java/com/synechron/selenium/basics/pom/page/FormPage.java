package com.synechron.selenium.basics.pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FormPage {

    //variables
    @FindBy(id = "first-name")
    private WebElement firstNameTextBox;

    @FindBy(id="last-name")
    private WebElement lastNameTextBox;

    @FindBy(id="job-title")
    private WebElement jobTitleTextBox;

    @FindBy(id="radio-button-3")
    private WebElement gradeSchoolRadioButton;

    @FindBy(id="checkbox-1")
    private WebElement maleCheckbox;

    @FindBy(xpath = "//a[text()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement successMessage;


    //methods
    public void enterFirstName(String firstName) {
        System.out.println("Entering first name: " + firstName);
        firstNameTextBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        System.out.println("Entering last name: " + lastName);
        lastNameTextBox.sendKeys(lastName);
    }

    public void enterJobTitle(String jobTitle) {
        System.out.println("Entering job title: " + jobTitle);
        jobTitleTextBox.sendKeys(jobTitle);
    }

    public void clickGradeSchool() {
        System.out.println("Clicking on  grade school: " );
        gradeSchoolRadioButton.click();
    }

    public void clickMaleCheckbox() {
        System.out.println("Clicking on male checkbox: " );
        maleCheckbox.click();
    }
    public void clickSubmitButton() {
        System.out.println("Clicking on submit button: " );
        submitButton.click();

    }

    public void validateSuccessMessage() {
        System.out.println("Validating success message: " );
        Assert.assertEquals(successMessage.getText(), "The form was successfully submitted!");
    }
    //Constructors
    public FormPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

}
