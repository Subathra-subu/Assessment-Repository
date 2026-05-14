package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPages {

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[contains(@class,'btn-default')]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@id='content']")
    public WebElement searchResult;
}