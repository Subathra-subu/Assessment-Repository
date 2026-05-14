package com.actions;

import java.util.Map;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pages.addressPages;
import com.utilities.HelperClass;

public class addressActions {

    addressPages addresspages = null;

    public addressActions() {

        this.addresspages = new addressPages();

        PageFactory.initElements(HelperClass.getDriver(), addresspages);
    }

    public void loginApplication() {

        addresspages.myAccount.click();

        addresspages.login.click();

        addresspages.email.sendKeys("sha@yahoo.com");

        addresspages.password.sendKeys("nvNF8#@jEmSeme");

        addresspages.loginButton.click();
    }

    public void navigateToAddressBook() {

        addresspages.addressBook.click();

        addresspages.newAddress.click();
    }

    public void enterAddressDetails(Map<String, String> data) {

        addresspages.firstName.sendKeys(data.get("firstname"));

        addresspages.lastName.sendKeys(data.get("lastname"));

        addresspages.address1.sendKeys(data.get("address1"));

        addresspages.city.sendKeys(data.get("city"));

        addresspages.postcode.sendKeys(data.get("postcode"));

        Select countryDropDown = new Select(addresspages.getCountry());

        countryDropDown.selectByVisibleText(data.get("country"));

        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(addresspages.getRegion()));

        Select regionDropDown = new Select(addresspages.getRegion());

        regionDropDown.selectByVisibleText(data.get("region"));
       
    }

    public void clickContinue() {

        addresspages.continueButton.click();
    }

    public String successMessage() {

        return addresspages.successMessage.getText();
    }
}