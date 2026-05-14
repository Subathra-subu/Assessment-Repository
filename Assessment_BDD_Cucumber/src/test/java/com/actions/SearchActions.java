package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.pages.SearchPages;
import com.utilities.HelperClass;

public class SearchActions {

    SearchPages searchPages = null;

    public SearchActions() {

        this.searchPages = new SearchPages();

        PageFactory.initElements(HelperClass.getDriver(), searchPages);
    }

    public void enterProduct(String product) {

        searchPages.searchBox.sendKeys(product);
    }

    public void clickSearch() {

        searchPages.searchButton.click();
    }

    public String getSearchResultText() {

        return searchPages.searchResult.getText();
    }
}